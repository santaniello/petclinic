package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.vet.dto.SpecialtyDTO;
import br.com.felipe.petclinic.vet.dto.SpecialtySaveRequestDTO;
import br.com.felipe.petclinic.vet.entity.SpecialtyEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class SpecialtyService {
    private SpecialtyRepository repository;
    private ModelMapper mapper;

    @Transactional
    public SpecialtyDTO create(SpecialtySaveRequestDTO dto){
        SpecialtyEntity entity = mapper.map(dto, SpecialtyEntity.class);
        SpecialtyEntity entitySaved = repository.save(entity);
        return mapper.map(entitySaved, SpecialtyDTO.class);
    }

    public Page<SpecialtyEntity> findAll(int page){
        int pageSize = 5;
        Pageable pageable = PageRequest.of(page - 1, pageSize);
        return repository.findAll(pageable);
    }
}

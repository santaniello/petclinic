package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.vet.dto.VetRequestDTO;
import br.com.felipe.petclinic.vet.dto.VetResponseDTO;
import br.com.felipe.petclinic.vet.entity.VetEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class VetService {
    private VetRepository repository;
    private ModelMapper mapper;

    @Transactional
    public VetResponseDTO create(VetRequestDTO dto){
        VetEntity vetEntity = mapper.map(dto, VetEntity.class);
        VetEntity vetEntitySaved = repository.save(vetEntity);

        return mapper.map(vetEntitySaved, VetResponseDTO.class);
    }
}

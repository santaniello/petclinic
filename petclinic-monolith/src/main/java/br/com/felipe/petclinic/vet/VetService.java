package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.vet.dto.VetDTO;
import br.com.felipe.petclinic.vet.entity.VetEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VetService {
    private VetRepository repository;
    private ModelMapper mapper;

    public void create(VetDTO dto){
        VetEntity vetEntity = mapper.map(dto, VetEntity.class);
        repository.save(vetEntity);
    }
}

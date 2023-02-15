package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.vet.dto.VetDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VetService {
    private VetRepository repository;

    public void create(VetDTO dto){

    }
}

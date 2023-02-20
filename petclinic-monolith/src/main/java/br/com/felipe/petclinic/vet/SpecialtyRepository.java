package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.vet.entity.SpecialtyEntity;
import br.com.felipe.petclinic.vet.entity.VetEntity;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<SpecialtyEntity, Integer> {
}

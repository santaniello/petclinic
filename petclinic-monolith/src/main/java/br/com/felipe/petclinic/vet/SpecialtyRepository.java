package br.com.felipe.petclinic.vet;
import br.com.felipe.petclinic.vet.entity.SpecialtyEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface SpecialtyRepository extends CrudRepository<SpecialtyEntity, Integer> {
    @Transactional(readOnly = true)
    @Cacheable("specialties")
    Page<SpecialtyEntity> findAll();
}

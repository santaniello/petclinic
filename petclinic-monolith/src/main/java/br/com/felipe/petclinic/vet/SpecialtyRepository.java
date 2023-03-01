package br.com.felipe.petclinic.vet;
import br.com.felipe.petclinic.vet.entity.SpecialtyEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface SpecialtyRepository extends JpaRepository<SpecialtyEntity, Integer> {
    @Transactional(readOnly = true)
    @Cacheable("specialties")
    Page<SpecialtyEntity> findAll(Pageable pageable);
}

package br.com.felipe.petclinic.vet.entitydb;

import br.com.felipe.petclinic.common.entity.PersonEntity;
import br.com.felipe.petclinic.vet.entitydb.SpecialtyEntityDB;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vets")
public class VetEntityDB extends PersonEntity {
    @Column(name = "document", unique = true)
    private int document;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<SpecialtyEntityDB> specialties;
}

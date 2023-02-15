package br.com.felipe.petclinic.vet.entity;

import br.com.felipe.petclinic.common.Person;
import br.com.felipe.petclinic.common.entity.PersonEntity;
import br.com.felipe.petclinic.vet.Specialty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "vets")
public class VetEntity extends PersonEntity {
    @Column(name = "document", unique = true)
    private int document;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<SpecialtyEntity> specialties;
}

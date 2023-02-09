package br.com.felipe.petclinic.vet.entity;

import br.com.felipe.petclinic.common.Person;
import br.com.felipe.petclinic.vet.Specialty;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

public final class VetEntity extends Person {
    private Set<Specialty> specialties;

    public VetEntity(String firstName, String lastName, Set<Specialty> specialties) {
        super(firstName, lastName);
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return unmodifiableSet(specialties);
    }
}

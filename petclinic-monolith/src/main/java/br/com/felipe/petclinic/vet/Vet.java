package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.common.Person;

import java.util.Collections;
import java.util.Set;

import static java.util.Collections.*;

public final class Vet extends Person {
    private Set<Specialty> specialties;

    public Vet(String firstName, String lastName, Set<Specialty> specialties) {
        super(firstName, lastName);
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return unmodifiableSet(specialties);
    }
}

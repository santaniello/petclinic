package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.common.model.Person;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

public final class Vet extends Person {
    private int document;
    private Set<Specialty> specialties;

    public Vet(String firstName, String lastName, int document) {
        super(firstName, lastName);
        this.document = document;
    }

    public Vet(String firstName, String lastName, Set<Specialty> specialties) {
        super(firstName, lastName);
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return unmodifiableSet(specialties);
    }
}

package br.com.felipe.petclinic.vet.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter @Setter
public class VetDTO {
    private int document;
    private String firstName;
    private String lastName;
    private Set<Integer> specialties;
}

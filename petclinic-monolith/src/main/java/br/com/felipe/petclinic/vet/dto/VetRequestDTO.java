package br.com.felipe.petclinic.vet.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter @Setter
public class VetRequestDTO {
    private int document;
    private String firstName;
    private String lastName;
    private Set<SpecialtyRequestDTO> specialties;
}

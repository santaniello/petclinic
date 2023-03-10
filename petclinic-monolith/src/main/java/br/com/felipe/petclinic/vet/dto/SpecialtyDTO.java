package br.com.felipe.petclinic.vet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpecialtyDTO {
    private int id;
    private String name;

    public SpecialtyDTO(int id) {
        this.id = id;
    }

    public SpecialtyDTO(String name) {
        this.name = name;
    }
}

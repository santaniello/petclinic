package br.com.felipe.petclinic.common;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StandardResponseDTO<T> {
    private T content;
    private String message;
    private List<ErrorResponseDTO> errors;

    public StandardResponseDTO(T content, String message) {
        this.content = content;
        this.message = message;
    }
}

package br.com.felipe.petclinic.common;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Getter
@AllArgsConstructor
public class StandardResponseDTO<T> {
    private T content;
    private String message;
    private Pageable pageable;
    private List<ErrorResponseDTO> errors;

    public StandardResponseDTO(T content, String message) {
        this.content = content;
        this.message = message;
    }

    public StandardResponseDTO(T content, String message, Pageable pageable) {
        this.content = content;
        this.message = message;
        this.pageable = pageable;
    }
}

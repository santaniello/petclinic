package br.com.felipe.petclinic.common;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class ErrorResponseDTO {
    private final String message;
    private final int code;
    private final String field;
}

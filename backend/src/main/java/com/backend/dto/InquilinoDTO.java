package com.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InquilinoDTO {
    private String nombre;
    private String contacto;
    private int departamento;
}

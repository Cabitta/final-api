package com.backend.mapper;

import com.backend.dto.InquilinoDTO;
import com.backend.entity.InquilinoEntity;
import org.springframework.stereotype.Component;

@Component
public class InquilinoMapper {
    public InquilinoDTO toDto(InquilinoEntity entity) {
        return InquilinoDTO.builder()
                .contacto(entity.getContacto())
                .nombre(entity.getNombre())
                .departamento(entity.getDepartamento())
                .build();
    }
    public InquilinoEntity toEntity(InquilinoDTO dto) {
        return InquilinoEntity.builder()
                .contacto(dto.getContacto())
                .nombre(dto.getNombre())
                .departamento(dto.getDepartamento())
                .build();
    }
}

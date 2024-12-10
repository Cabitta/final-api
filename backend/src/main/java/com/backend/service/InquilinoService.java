package com.backend.service;

import com.backend.dto.InquilinoDTO;
import com.backend.entity.InquilinoEntity;
import com.backend.mapper.InquilinoMapper;
import com.backend.repository.InquilinoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class InquilinoService {
    private InquilinoRepository repository;
    private InquilinoMapper mapper;
    /*
    public List<InquilinoDTO> getAll(){
         List<InquilinoEntity> entities = repository.findAll();
         return entities.stream()
                        .map(mapper::toDto)
                        .toList();
    }

     */
}

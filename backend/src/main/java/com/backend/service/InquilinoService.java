package com.backend.service;

import com.backend.repository.InquilinoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InquilinoService {
    private InquilinoRepository repository;
}

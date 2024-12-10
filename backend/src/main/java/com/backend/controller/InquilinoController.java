package com.backend.controller;

import com.backend.entity.InquilinoEntity;
import com.backend.repository.InquilinoRepository;
import com.backend.service.InquilinoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inquilino")
@AllArgsConstructor
public class InquilinoController {
    private InquilinoService service;
    private InquilinoRepository repo;

    public List<InquilinoEntity> getAll() {
        return repo.findAll();
    }
}

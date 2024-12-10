package com.backend.controller;

import com.backend.entity.InquilinoEntity;
import com.backend.repository.InquilinoRepository;
import com.backend.service.InquilinoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inquilino")
@AllArgsConstructor
public class InquilinoController {
    private InquilinoService service;
    @Autowired
    private InquilinoRepository repository;

    @GetMapping
    public List<InquilinoEntity> getAll() {
        return repository.findAll();
    }
}

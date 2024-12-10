package com.backend.controller;

import com.backend.service.InquilinoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inquilino")
@AllArgsConstructor
public class InquilinoController {
    private InquilinoService service;
}

package com.backend.controller;

import com.backend.service.ReservaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
@AllArgsConstructor
public class ReservaController {
    private ReservaService service;
}

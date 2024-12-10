package com.backend.service;

import com.backend.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservaService {
    private ReservaRepository repository;
}

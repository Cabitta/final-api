package com.backend.service;

import com.backend.entity.HorarioEntity;
import com.backend.repository.HorarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HorarioService {
    private HorarioRepository repository;
}

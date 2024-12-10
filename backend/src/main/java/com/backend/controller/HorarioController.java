package com.backend.controller;

import com.backend.entity.HorarioEntity;
import com.backend.repository.HorarioRepository;
import com.backend.service.HorarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/horario")
@AllArgsConstructor
public class HorarioController {
    private HorarioService service;
    private HorarioRepository repository;

    //@GetMapping
    //public List<HorarioEntity> getAllMaterias(){
    //    return repository.findAll();
    //}
}

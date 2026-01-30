package com.practica.elementos.service;

import com.practica.elementos.entities.Cuaderno;
import com.practica.elementos.repositories.CuadernoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CuadernoServiceImpl implements CuadernoService {


    CuadernoRepository repository;

    public CuadernoServiceImpl(CuadernoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Cuaderno> findAll() {
        return repository.findAll();
    }
}

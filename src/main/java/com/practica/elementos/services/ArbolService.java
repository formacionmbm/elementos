package com.practica.elementos.services;

import com.practica.elementos.entities.Arbol;
import com.practica.elementos.repositories.ArbolRepository;
import com.practica.elementos.services.interfaces.ArbolInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArbolService implements ArbolInterface {

    @Autowired
    ArbolRepository repository;

    @Override
    public List<Arbol> obtenerArboles() {
        log.info("[obtenerArboles]");
        return repository.findAll();
    }
}

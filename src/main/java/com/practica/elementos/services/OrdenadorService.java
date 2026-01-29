package com.practica.elementos.services;

import com.practica.elementos.entities.Ordenador;
import com.practica.elementos.repositories.OrdenadorRepository;
import com.practica.elementos.services.interfaces.ListarOrdenadores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class OrdenadorService implements ListarOrdenadores {

    OrdenadorRepository repository;
    public OrdenadorService(OrdenadorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Ordenador> index() {
        return repository.findAll();
    }

}

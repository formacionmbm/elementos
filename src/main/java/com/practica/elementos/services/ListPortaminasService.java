package com.practica.elementos.services;

import com.practica.elementos.entities.Portaminas;
import com.practica.elementos.repositories.PortaminasRepository;
import com.practica.elementos.services.interfaces.ListPortaminas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ListPortaminasService implements ListPortaminas {
    private final PortaminasRepository repository;

    public ListPortaminasService(PortaminasRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Portaminas> findAll() {
        log.info("[findAll]");
        return repository.findAll();

    }


}
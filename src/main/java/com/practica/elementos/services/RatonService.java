package com.practica.elementos.services;

import com.practica.elementos.entities.Raton;
import com.practica.elementos.repositories.RatonRepository;
import com.practica.elementos.services.interfaces.IRaton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RatonService implements IRaton {

    RatonRepository repository;
    public RatonService(RatonRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Raton> findAll() {
        log.info("[listaRaton]");
        return repository.findAll();
    }
}

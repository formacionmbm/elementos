package com.practica.elementos.services;

import com.practica.elementos.entities.Bicicleta;
import com.practica.elementos.repositories.BicicletaRepository;
import com.practica.elementos.services.interfaces.ServiceBuscadores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceBuscadoresImpl implements ServiceBuscadores {
    BicicletaRepository bicicletaRepository;

    public ServiceBuscadoresImpl(BicicletaRepository repositorio) {
        this.bicicletaRepository = repositorio;
    }

    @Override
    public List<Bicicleta> buscarBicicletas() {
        log.info("[findAll]");
        return bicicletaRepository.findAll();
    }


}
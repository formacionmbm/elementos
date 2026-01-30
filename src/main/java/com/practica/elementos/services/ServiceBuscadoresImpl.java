package com.practica.elementos.services;

import com.practica.elementos.entities.Coche;
import com.practica.elementos.repositories.CocheRepository;
import com.practica.elementos.services.interfaces.ServiceBuscadores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceBuscadoresImpl implements ServiceBuscadores {

    @Autowired
    private CocheRepository cocheRepository;

    /* @Override
    public List<Coche> buscarTodos() {
        //log.info("[ServiceBuscadoresImpl]");

        return cocheRepository.findAll();
    } */

    @Override
    public List<Coche> buscarTodos() {
      //  return List.of();
        return cocheRepository.findAll();
    }

    @Override
    public List<Coche> buscarModelo(String modelo) {
        log.info("[ServiceBuscadoresImpl] -> Buscando por: {}", modelo);

        return cocheRepository.findByModeloContainingIgnoreCase(modelo);
    }
}
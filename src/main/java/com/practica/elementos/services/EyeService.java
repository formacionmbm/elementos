package com.practica.elementos.services;

import com.practica.elementos.entities.Eye;
import com.practica.elementos.repositories.EyeRepository;
import com.practica.elementos.services.interfaces.EyeCute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j //para trazas
public class EyeService implements EyeCute {

    @Autowired //inyección de dependencias
    EyeRepository repository;

    // también se puede hacer con el constructor
    //public EyeList(EyeRepository repository) {
    // this.repository = repository
    // }

    @Override
    public List<Eye> EyeList() { //devuelve una lista de los ojos
        log.info("[list]"); //traza
        return repository.findAll();
    }

}




package com.practica.elementos.services;

import com.practica.elementos.entities.Archivador;
import com.practica.elementos.repositories.ArchivadorRepository;
import com.practica.elementos.services.interfaces.ArchivadorInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArchivadorService implements ArchivadorInterface {

    ArchivadorRepository archivadorRepository;

    public ArchivadorService(ArchivadorRepository archivadorRepository) {
        this.archivadorRepository = archivadorRepository;
    }

    @Override
    public List<Archivador> findAll() {
        log.info("[ArchivadorService/findAll]");

        return archivadorRepository.findAll();
    }
}

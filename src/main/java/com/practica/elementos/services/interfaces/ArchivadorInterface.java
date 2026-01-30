package com.practica.elementos.services.interfaces;

import com.practica.elementos.entities.Archivador;

import java.util.List;

public interface ArchivadorInterface {
    public List<Archivador> findAll();
    public Archivador save(Archivador archivador);
    public Archivador findById(Integer id);
    public void delete(Integer id);

}

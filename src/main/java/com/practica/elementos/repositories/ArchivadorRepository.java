package com.practica.elementos.repositories;

import com.practica.elementos.entities.Archivador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchivadorRepository extends JpaRepository<Archivador, Integer> {
}
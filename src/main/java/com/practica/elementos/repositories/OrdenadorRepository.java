package com.practica.elementos.repositories;


import com.practica.elementos.entities.Ordenador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrdenadorRepository extends JpaRepository<Ordenador, Long>{
}



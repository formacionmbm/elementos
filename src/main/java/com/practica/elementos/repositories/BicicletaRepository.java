package com.practica.elementos.repositories;

import com.practica.elementos.entities.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicicletaRepository extends JpaRepository<Bicicleta,Long> {
}

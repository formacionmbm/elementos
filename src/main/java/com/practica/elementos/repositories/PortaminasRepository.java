package com.practica.elementos.repositories;

import com.practica.elementos.entities.Portaminas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PortaminasRepository extends JpaRepository<Portaminas,Long> {

}

package com.practica.elementos.repositories;

import com.practica.elementos.entities.Movil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MovilRepository extends JpaRepository<Movil, Long> {

}

package com.practica.elementos.repositories;

import com.practica.elementos.entities.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {

    Optional<Coche> findById(String Id);

}
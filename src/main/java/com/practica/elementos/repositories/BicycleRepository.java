package com.practica.elementos.repositories;

import com.practica.elementos.entities.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicycleRepository extends JpaRepository<Bicycle,Long> {
}

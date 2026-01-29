package com.practica.elementos.repositories;

import com.practica.elementos.entities.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor,Integer> {
}

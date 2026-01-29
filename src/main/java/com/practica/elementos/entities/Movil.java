package com.practica.elementos.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Movil {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String marca;

}

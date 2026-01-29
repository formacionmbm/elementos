package com.practica.elementos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
}

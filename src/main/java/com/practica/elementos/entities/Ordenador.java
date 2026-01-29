package com.practica.elementos.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Ordenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//primitivo porque nunca puede ser null
    private String name;

}





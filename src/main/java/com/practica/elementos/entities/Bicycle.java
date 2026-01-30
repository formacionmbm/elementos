package com.practica.elementos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bicycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "BICYCLETYPE")
    private BicycleType bicycleType;

    /*
        ✔ Guarda el enum como texto en la BD --> @Enumerated(EnumType.STRING)
       ❌ Nunca uses ORDINAL (rompe todo si cambiás el orden del enum)
     */
}

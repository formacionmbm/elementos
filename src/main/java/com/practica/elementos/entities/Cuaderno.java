package com.practica.elementos.entities;


import com.practica.elementos.common.TipoHoja;
import jakarta.persistence.*;


import lombok.Data;

@Entity
@Data
public class Cuaderno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private TipoHoja tipo;
}

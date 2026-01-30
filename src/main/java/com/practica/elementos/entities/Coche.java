package com.practica.elementos.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.practica.elementos.entities.TipoCoche;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String modelo;
   // private int anio;

    @Enumerated(EnumType.STRING)
    private TipoCoche tipo;

}
package com.practica.elementos.entities;

import com.practica.elementos.common.Familia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arbol {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="FAMILIA")
    @Enumerated(EnumType.STRING)
    private Familia familia;
}

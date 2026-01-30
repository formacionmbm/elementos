package com.practica.elementos.entities;

import com.practica.elementos.model.enums.MarcaArchivador;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Archivador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String modelo;

    @Enumerated(EnumType.STRING)
    @Column(name = "MARCAARCHIVADOR")
    private MarcaArchivador marcaArchivador;
}
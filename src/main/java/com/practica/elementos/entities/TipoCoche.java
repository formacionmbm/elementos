package com.practica.elementos.entities;

import lombok.Getter;

@Getter
public enum TipoCoche {
    ELECTRICO("Eléctrico"),
    DIESEL("Diésel"),
    GASOLINA("Gasolina"),
    HIBRIDO("Híbrido");

    private final String descripcion;

    TipoCoche(String descripcion) {
        this.descripcion = descripcion;
    }
}




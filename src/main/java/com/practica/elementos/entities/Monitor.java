package com.practica.elementos.entities;

import com.practica.elementos.common.TipoPantalla;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;

    @Enumerated(EnumType.STRING)
    private TipoPantalla tipoPantalla;

    public Monitor(String marca) {
        this.marca = marca;
    }
}

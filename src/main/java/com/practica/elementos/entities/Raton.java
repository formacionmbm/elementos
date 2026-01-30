package com.practica.elementos.entities;

import com.practica.elementos.common.TipoConexion;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Raton {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private TipoConexion conexion;

}

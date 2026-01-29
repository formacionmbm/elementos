package com.practica.elementos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //hibernate
@Data //lombok
@AllArgsConstructor //genera un constructor con todos los atributos de la clase.
@NoArgsConstructor //genera un constructor vacío
public class Eye {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //para hacer autonuméricos
    @Column (name="ID") //nombre de la columna
    private long id;
    @Column (name="NAME") //nombre de la columna
    private String name;


}

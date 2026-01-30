package com.practica.elementos.entities;

import com.practica.elementos.common.EyeColor;
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
    @Column (name= "ID")
    private long id;
    @Column (name= "NAME")
    private String name;
    @Enumerated (EnumType.STRING) //etiqueta
    @Column (name= "COLOR")
    private EyeColor color; //atributo de tipo EyeColor

}

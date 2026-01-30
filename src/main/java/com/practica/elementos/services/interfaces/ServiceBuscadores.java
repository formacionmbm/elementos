package com.practica.elementos.services.interfaces;

import com.practica.elementos.entities.Coche;
import java.util.List;

public interface ServiceBuscadores {
    List<Coche> buscarTodos();
    List<Coche> buscarModelo(String modelo);
}


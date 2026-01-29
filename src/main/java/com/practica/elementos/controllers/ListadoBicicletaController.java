package com.practica.elementos.controllers;

import com.practica.elementos.entities.Bicicleta;
import com.practica.elementos.services.interfaces.ServiceBuscadores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class ListadoBicicletaController {

    @Autowired
    ServiceBuscadores servicio;

    @GetMapping("/bicicleta")
    public String findAll(Model model) {
        log.info("[findAll]");
        List<Bicicleta> list = servicio.buscarBicicletas();
        log.debug("[Bicicleta List:{}", list);

        model.addAttribute("listadoBicicletas", list); // Esto es meterlo en el modelo
        return "/search/t_search_bicicleta";
    }
}



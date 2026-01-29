package com.practica.elementos.controllers;

import com.practica.elementos.entities.Coche;
import com.practica.elementos.repositories.CocheRepository;
import com.practica.elementos.services.ServiceBuscadoresImpl;
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
public class CocheController {

    @Autowired
    private CocheRepository cocheRepository;

    @GetMapping("/coche")
    public String listaCoche(Model model) {
        log.info("[listaCoche]");

        List<Coche> lista = cocheRepository.findAll();
                //List.of();
        model.addAttribute("listaCoches", lista);
        //log.debug["lista: {}", lista];
        return "coche";
    }
}
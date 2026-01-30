package com.practica.elementos.controllers;

import com.practica.elementos.entities.Coche;
import com.practica.elementos.repositories.CocheRepository;
import com.practica.elementos.services.ServiceBuscadoresImpl;
import com.practica.elementos.services.interfaces.ServiceBuscadores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.practica.elementos.entities.TipoCoche;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class CocheController {

    @Autowired
    private ServiceBuscadores serviceBuscadores;

    //private CocheRepository cocheRepository;

    /*   @GetMapping("/coche")
    public String listaCoche(Model model) {
        log.info("[listaCoche]");

        List<Coche> lista = cocheRepository.findAll();
                //List.of();
        model.addAttribute("listaCoches", lista);
        //log.debug["lista: {}", lista];
        return "coche";
    }       */

    @GetMapping("/coche")
    public String listaCoche(@RequestParam(name = "modelo", required = false) String modelo, Model model) {
        List<Coche> lista;

        // aqui filtr solo si hay algo escrito
        if (modelo != null && !modelo.trim().isEmpty()) {
            lista = serviceBuscadores.buscarModelo(modelo);
        } else {
            lista = serviceBuscadores.buscarTodos();
        }

        model.addAttribute("listaCoches", lista);
        //return "coche";

        //tipos de combustible
        model.addAttribute("todosLosTipos", TipoCoche.values());

        return "coche";
    }
}
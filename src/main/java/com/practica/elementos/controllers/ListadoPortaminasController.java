package com.practica.elementos.controllers;

import com.practica.elementos.entities.Portaminas;
import com.practica.elementos.services.interfaces.ListPortaminas;
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
public class ListadoPortaminasController {
    @Autowired
    ListPortaminas servicio;

    @GetMapping("/portaminas")
    public String listaPortaminas(Model model) {
        log.info("[listarPortaminas]");

        List<Portaminas> list = servicio.findAll();
        model.addAttribute("ListaPortaminas", list);
        log.debug("lista:{}",list);

        return "portaminas";
    }
}
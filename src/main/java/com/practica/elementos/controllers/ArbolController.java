package com.practica.elementos.controllers;

import com.practica.elementos.entities.Arbol;
import com.practica.elementos.services.ArbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/arbol")
public class ArbolController {

    @Autowired
    ArbolService service;

    @GetMapping
    public String mostrarArboles( Model model){
        log.info("[mostrarArboles]");
        List<Arbol> arboles=service.obtenerArboles();
        log.debug("[mostrarArboles: {}]", arboles);
        model.addAttribute("arboles",arboles);

        return "list_arbol";
    }

}

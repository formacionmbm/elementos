package com.practica.elementos.controllers;

import com.practica.elementos.entities.Portaminas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class PortaminasController {

    @GetMapping("/portaminas")
    public String listaPortaminas(Model model) {
        log.info("[listarPortaminas]");

        List<Portaminas> list = List.of();
        model.addAttribute("ListaOrdenadores", list);

        return "portaminas";
    }
}
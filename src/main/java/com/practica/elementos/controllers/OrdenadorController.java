package com.practica.elementos.controllers;

import com.practica.elementos.entities.Ordenador;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class OrdenadorController{

    @GetMapping("/ordenador")
    public String index(Model model){
    log.info("[index]");
        List<Ordenador> listaDeOrdenadores=List.of();
        model.addAttribute("listOrdenadores",listaDeOrdenadores);
    return "ordenadores";
    }
}

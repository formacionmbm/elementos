package com.practica.elementos.controllers;

import com.practica.elementos.entities.Arbol;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/arbol")
public class ArbolController {

    @GetMapping
    public String listaArboles( Model model){
        log.info("[listaArboles]");
        List<Arbol> arboles=List.of();
        log.debug("[listaArboles: {}]", arboles);
        model.addAttribute("arboles",arboles);

        return "list_arbol";
    }

}

package com.practica.elementos.controllers;

import com.practica.elementos.entities.Cuaderno;
import com.practica.elementos.service.CuadernoService;
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
public class CuadernoController {


    CuadernoService servicio;
    public CuadernoController(CuadernoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/cuaderno")
    public String listaCuadernos(Model model){
        log.info("[listarCuaderno]");
        List<Cuaderno> lista= servicio.findAll();
        model.addAttribute("cuadernos",lista);
        model.addAttribute("tipo", lista);
        log.debug("[Cuadernos: lista:{}]", lista);
        return "cuaderno";



    }



}

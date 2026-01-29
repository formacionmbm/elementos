package com.practica.elementos.controllers;

import com.practica.elementos.entities.Cuaderno;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class CuadernoController {


    @GetMapping("/cuaderno")
    public String listaCuaderno(Model model){
        log.info("[listarCuaderno]");
        List<Cuaderno> lista= List.of();
        model.addAttribute("cuadernos",lista);
        return "cuaderno";

    }
}

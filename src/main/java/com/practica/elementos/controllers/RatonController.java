package com.practica.elementos.controllers;

import com.practica.elementos.entities.Raton;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class RatonController {


    @GetMapping("/raton")
    public String listaRaton(Model model){
        log.info("[listaRaton]");
        List<Raton> lista = List.of();
        model.addAttribute("listaRatones", lista);
        return "raton";
    }



}

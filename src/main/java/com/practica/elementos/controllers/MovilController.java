package com.practica.elementos.controllers;



import com.practica.elementos.entities.Movil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class MovilController {
    @GetMapping("/movil")

    public String mostrarmovil(Model model){
        log.info("mostrarmoviles");

        List<Movil> moviles=List.of();
        model.addAttribute("List", moviles);

        return "tmovil";
    }

}

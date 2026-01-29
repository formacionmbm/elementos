package com.practica.elementos.controllers;

import com.practica.elementos.entities.Archivador;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@Slf4j
@RequestMapping("/archivador")
public class ArchivadorController {

    @GetMapping
    public String findAll(Model model) {
        log.info("[findAll]");

        List<Archivador> list = List.of();
        model.addAttribute("listArchivadores", list);

        return "t_archivador";
    }
}

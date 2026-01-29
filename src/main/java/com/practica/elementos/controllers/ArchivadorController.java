package com.practica.elementos.controllers;

import com.practica.elementos.entities.Archivador;
import com.practica.elementos.services.ArchivadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@Slf4j
@RequestMapping("/archivador")
public class ArchivadorController {

    @Autowired
    private ArchivadorService archivadorService;

    @GetMapping
    public String findAll(Model model) {
        log.info("[ArchivadorController/findAll]");

        List<Archivador> list = archivadorService.findAll();
        model.addAttribute("listArchivadores", list);

        log.info("[Result ArchivadorList:{}]", list);

        return "t_archivador";
    }
}

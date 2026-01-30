package com.practica.elementos.controllers;

import com.practica.elementos.entities.Archivador;
import com.practica.elementos.model.enums.MarcaArchivador;
import com.practica.elementos.services.ArchivadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Controller
@Slf4j
@RequestMapping("/archivador")
public class ArchivadorController {

    private final ArchivadorService archivadorService;

    public ArchivadorController(ArchivadorService archivadorService) {
        this.archivadorService = archivadorService;
    }

    @GetMapping
    public String findAll(Model model) {
        log.info("[ArchivadorController/findAll]");

        List<Archivador> list = archivadorService.findAll();
        model.addAttribute("listArchivadores", list);

        List<String> listaMarca = Arrays.stream(MarcaArchivador.values()) .map(Enum::name) .toList();
        model.addAttribute("listMarcaArchivadores", listaMarca);

        log.info("[Result ArchivadorList:{}]", list);
        return "t_archivador";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("archivador", new Archivador());
        return "t_archivador_form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Archivador archivador) {
        Archivador saved = archivadorService.save(archivador);
        log.info("[ArchivadorController/guardar] Saved archivador: {}", saved);
        return "redirect:/archivador"; // redirect al endpoint original
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Archivador archivador = archivadorService.findById(id);
        if (archivador == null) {
            log.warn("[ArchivadorController/editar] Archivador not found with id: {}", id);
            return "redirect:/archivador";
        }
        model.addAttribute("archivador", archivador);
        return "t_archivador_form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        Archivador archivador = archivadorService.findById(id);
        if (archivador != null) {
            archivadorService.delete(id);
            log.info("[ArchivadorController/eliminar] Deleted archivador with id: {}", id);
        } else {
            log.warn("[ArchivadorController/eliminar] Archivador not found with id: {}", id);
        }
        return "redirect:/archivador";
    }
}



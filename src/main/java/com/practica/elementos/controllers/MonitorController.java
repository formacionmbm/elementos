package com.practica.elementos.controllers;

import com.practica.elementos.entities.Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/monitor")
@Slf4j
public class MonitorController {

    @GetMapping
    public String mostrarTMonitor(Model model){
        log.info("[mostrarTMonitor]");

        List<Monitor> monitores= List.of();
        model.addAttribute("list", monitores);

        return "t_monitor";
    }

}

package com.practica.elementos.controllers;

import com.practica.elementos.common.TipoPantalla;
import com.practica.elementos.entities.Monitor;
import com.practica.elementos.services.exceptions.ServiceException;
import com.practica.elementos.services.interfaces.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/monitor")
@Slf4j
public class MonitorController {

    @Autowired
    MonitorService servicio;

    @GetMapping
    public String mostrarListaMonitor(Model model) throws ServiceException {
        log.info("[mostrarListaMonitor]");

        List<Monitor> monitores = servicio.findAllMonitor();
        log.debug("[monitores: {}]",monitores);

        List<TipoPantalla> tipoPantallas = List.of(TipoPantalla.values());
        log.debug("[tipos de pantalla: {}]",tipoPantallas);

        model.addAttribute("list_m", monitores);
        model.addAttribute("list_p", tipoPantallas);

        return "t_monitor";
    }

}

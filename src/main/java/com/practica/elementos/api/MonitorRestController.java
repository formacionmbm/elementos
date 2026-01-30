package com.practica.elementos.api;

import com.practica.elementos.entities.Monitor;
import com.practica.elementos.services.exceptions.ServiceException;
import com.practica.elementos.services.interfaces.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
public class MonitorRestController {

    @Autowired
    MonitorService servicio;

    @GetMapping({"/api","/api/monitor"})
    public List<Monitor> mostrarListaMonitor() throws ServiceException {
        log.info("[mostrarListaMonitor]");

        List<Monitor> monitores = servicio.findAllMonitor();
        log.debug("[monitores: {}]",monitores);

        return monitores;
    }

}

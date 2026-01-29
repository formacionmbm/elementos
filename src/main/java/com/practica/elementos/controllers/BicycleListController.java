package com.practica.elementos.controllers;

import com.practica.elementos.entities.Bicycle;
import com.practica.elementos.services.interfaces.BicycleFindService;
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
public class BicycleListController {

    @Autowired
    BicycleFindService service;

    @GetMapping("/bicycle")
    public String findAll(Model model) {
        log.info("[findAll]");
        List<Bicycle> list = service.lookForBicycle();
        log.debug("[Bicycle List:{}", list);

        model.addAttribute("bicycleList", list);
        return "/search/t_search_bicicleta";
    }
}



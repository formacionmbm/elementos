package com.practica.elementos.controllers;

import com.practica.elementos.entities.Eye;
import com.practica.elementos.services.EyeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@Slf4j //trazas
@RequestMapping
public class EyeControllers {

    @Autowired
    EyeService service;

    @GetMapping  ("/eye")
    public String listEye (Model model) {
        log.info("EyeSearch");
        List<Eye> list= service.EyeList(); //list.of = lista vacía
        model.addAttribute("eye", list);
        log.debug("List:{}", list);
        return "e_eye"; //e_eye.html
    }

}

package com.practica.elementos.controllers;

import com.practica.elementos.entities.Eye;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@Slf4j //trazas
@RequestMapping
public class EyeControllers {

    @GetMapping  ("/eye")
    public String listEye (Model model) {
        log.info("Busca Eye controller");
        List<Eye> list= List.of();
        model.addAttribute("eye", list);
        return "e_eye"; //e_eye.html
    }

}

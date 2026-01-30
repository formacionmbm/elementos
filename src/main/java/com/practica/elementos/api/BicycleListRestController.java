package com.practica.elementos.api;

import com.practica.elementos.entities.Bicycle;
import com.practica.elementos.services.interfaces.BicycleFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class BicycleListRestController {

    @Autowired
    BicycleFindService service;

    //@GetMapping({"/api","/api/bicycle"}) --> Mejor lo separo para dejar claro que /api es el contexto base de la API REST
    @GetMapping("/bicycle")
    public List<Bicycle> findAll() {
        log.info("[findAll]");
        List<Bicycle> list = service.lookForBicycle();

        //log.debug("[Bicycle list:{}",list); --> Lo vamos a cambiar por Streams para poder imprimir
        // en las trazas para cada bicicleta en una línea diferente
        //list.stream().forEach(bicycle -> log.debug("[Bicycle: {}]", bicycle));
        list.forEach(bicycle -> log.debug("[Bicycle: {}]", bicycle));

        /*
        Regla práctica (muy útil)
          ✔ Solo recorrer / ejecutar algo                  list.forEach(...)
          ✔ Transformar, filtrar, componer operaciones     list.stream()...

        Bonus: detalle fino 🔍
          Stream.forEach() no garantiza orden en streams paralelos
          List.forEach() sí respeta el orden

          Por eso, incluso semánticamente, list.forEach es más correcto para este caso.
        */
        return list;
    }
}

package com.practica.elementos.services;

import com.practica.elementos.entities.Bicycle;
import com.practica.elementos.repositories.BicycleRepository;
import com.practica.elementos.services.interfaces.BicycleFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BicycleFindServiceImpl implements BicycleFindService {

    BicycleRepository bicycleRepository;
    public BicycleFindServiceImpl(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @Override
    public List<Bicycle> lookForBicycle() {
        log.info("[findAll]");
        return bicycleRepository.findAll();
    }
}

/*
    Con @Autowired:
        //    @Autowired
        //    BicycleRepository bicycleRepository;
        * no puedo usar campos final
        * Se complican los TESTs Unitarios puesto que no puedo pasarle un mock a mano (requiere reflexión o levantar todo el contexto de Spring)
        * No se ven las dependencias al instanciar (están ocultas)
        * Está considerado como una práctica en desuso

     Con Constructor:
         //BicycleRepository bicycleRepository;
         //public BicycleFindServiceImpl(BicycleRepository bicycleRepository)
         //     this.bicycleRepository = bicycleRepository;
         //}

        * Puedo usar campos final
        * Facilita los TESTs Unitarios ya que puedo pasarle un mock a mano
        * Se ven las dependencias al instanciar (están explícitas)
        * Es la práctica recomendada actualmente
 */
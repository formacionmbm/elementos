package com.practica.elementos.services;

import com.practica.elementos.entities.Monitor;
import com.practica.elementos.repositories.MonitorRepository;
import com.practica.elementos.services.exceptions.ServiceException;
import com.practica.elementos.services.interfaces.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MonitorServiceImpl implements MonitorService {

    MonitorRepository repositorio;

    public MonitorServiceImpl(MonitorRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Monitor> findAllMonitor() throws ServiceException {
        log.info("[findAllMonitor]");

        try {
            return repositorio.findAll();
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new ServiceException();
        }

    }
}

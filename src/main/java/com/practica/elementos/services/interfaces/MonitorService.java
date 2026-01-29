package com.practica.elementos.services.interfaces;

import com.practica.elementos.entities.Monitor;
import com.practica.elementos.services.exceptions.ServiceException;

import java.util.List;

public interface MonitorService {

    public List<Monitor> findAllMonitor() throws ServiceException;

}

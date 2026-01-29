package com.practica.elementos.services.exceptions;



public class ServiceException extends Exception {

    public ServiceException(){
        super("General Error Service Layer");
    }
    public ServiceException(String mensagge){
        super(mensagge);
    }
}

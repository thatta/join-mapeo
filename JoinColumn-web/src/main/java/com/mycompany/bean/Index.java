/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.dto.DTOCuenta;
import com.mycompany.dto.DTOInversor;
import com.mycompany.interfaces.InversorFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Tatiana Almansa
 */
@Named
@RequestScoped
public class Index implements Serializable{
    /**
     * atrbutos de la clase index
     */
    private String nombre;
    private String cuenta;
    /**
     * conexion con el mapeo de la base de datos
     */
    @EJB
    InversorFacadeLocal inversor;

    public Index(String nombre, String cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    /**
     * constructor vacio
     */
    public Index() {
    }
    
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    
    public void agregarInversor(){
        DTOInversor dtoInversor = new DTOInversor();
        DTOCuenta dtoCuenta = new DTOCuenta();
        dtoInversor.setNombre(nombre);
        dtoCuenta.setNumeroCuenta(cuenta);
        inversor.crearInversor(dtoInversor, dtoCuenta);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "AGREGADO","INVENSOR"+nombre+"exito..."));
        
    }
    
}

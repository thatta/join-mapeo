/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author Tatiana Almansa
 */
public class DTOInversor implements Serializable {
    /**
     * atributos de la clase inversor
     */
    private int id;
    private String nombre;
    /**
     * constructor vacio
     */
    public DTOInversor() {
    }
    /**
     * 
     * @param id
     * @param nombre 
     * constructor de los atributos de esta clase
     */
    public DTOInversor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     * 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     * metodo que obtiene el nombre del inversor
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     * metodo set que modifica el nombre del inversor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

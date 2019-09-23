/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

/**
 *
 * @author Tatiana Almansa
 */
public class DTOCuenta {
    /**
     * atributos de la clase cuenta 
     */
    private int id;
    private String numeroCuenta;
    /**
     * constructor vacio
     */
    public DTOCuenta() {
    }
    /**
     * 
     * @param id
     * @param numeroCuenta 
     * constructor de cada atributo de esta clase
     */
    public DTOCuenta(int id, String numeroCuenta) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * 
     * @return 
     * metodo get que obtiene el id de la tabla cuenta
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     * metodo set que modifica el id de la tabla cuenta
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return
     * metodo get que obtiene el numero de cuenta del inversor
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * 
     * @param numeroCuenta 
     * metodo set que modifica el numero de cuenta del inversor
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    
}

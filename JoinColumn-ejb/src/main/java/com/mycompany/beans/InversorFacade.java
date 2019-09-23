/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.DTOCuenta;
import com.mycompany.dto.DTOInversor;
import com.mycompany.entity.Cuenta;
import com.mycompany.interfaces.InversorFacadeLocal;
import com.mycompany.entity.Inversor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tatiana Almansa
 */
@Stateless
public class InversorFacade extends AbstractFacade<Inversor> implements InversorFacadeLocal {
    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InversorFacade() {
        super(Inversor.class);
    }
    /**
     * metodo para agregar un inversor a la base de datos
     */
    public void crearInversor(DTOInversor dtoInversor, DTOCuenta dtoCuenta){
        Inversor inversor = new Inversor();
        inversor.setNombre(dtoInversor.getNombre());
        Cuenta cuenta=new Cuenta();
        cuenta.setNumeroCuenta(dtoCuenta.getNumeroCuenta());
        cuenta.setInversor(inversor);
        inversor.setCuenta(cuenta);
        create(inversor);
    }
}

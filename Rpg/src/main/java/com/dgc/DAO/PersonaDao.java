/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.PersonaEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class PersonaDao extends GenericDao<Long, PersonaEntity> implements Serializable{

    @Override
    public List<PersonaEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaEntity merge(PersonaEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PersonaEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaEntity persist(PersonaEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

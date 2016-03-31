/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.HuellaEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class HuellaDao extends GenericDao<Long, HuellaEntity> implements Serializable{

    @Override
    public List<HuellaEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HuellaEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HuellaEntity merge(HuellaEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(HuellaEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HuellaEntity persist(HuellaEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}

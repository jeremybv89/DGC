/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.OpcionModuloEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class OpcionModuloDao extends GenericDao<Long, OpcionModuloEntity> implements Serializable{

    @Override
    public List<OpcionModuloEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpcionModuloEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpcionModuloEntity merge(OpcionModuloEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(OpcionModuloEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpcionModuloEntity persist(OpcionModuloEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}

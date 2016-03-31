/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.TiqueteraEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class TiqueteraDao extends GenericDao<Long, TiqueteraEntity> implements Serializable{

    @Override
    public List<TiqueteraEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TiqueteraEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TiqueteraEntity merge(TiqueteraEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(TiqueteraEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TiqueteraEntity persist(TiqueteraEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

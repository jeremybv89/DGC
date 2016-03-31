/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.RolEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class RolDao extends GenericDao<Long, RolEntity> implements Serializable{

    @Override
    public List<RolEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolEntity merge(RolEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(RolEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolEntity persist(RolEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.AsistenciaEntity;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author lenovo 1
 */
public class AsistenciaDao extends GenericDao<Long, AsistenciaEntity> implements Serializable{

    @Override
    public List<AsistenciaEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsistenciaEntity findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsistenciaEntity merge(AsistenciaEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(AsistenciaEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsistenciaEntity persist(AsistenciaEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}

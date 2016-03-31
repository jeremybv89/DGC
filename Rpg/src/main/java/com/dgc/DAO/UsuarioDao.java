/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import com.dgc.MODEL.UsuarioEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
public class UsuarioDao extends GenericDao<Long, UsuarioEntity> implements Serializable{

    @Override
    public List<UsuarioEntity> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioEntity merge(UsuarioEntity entity) {
        return super.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(UsuarioEntity entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioEntity persist(UsuarioEntity entity) {
        return super.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

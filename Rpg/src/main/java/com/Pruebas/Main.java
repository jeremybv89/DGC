/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pruebas;

import com.dgc.DAO.TipoParametroDao;
import com.dgc.MODEL.TipoParametroEntity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo 1
 */
//Putas harry
public class Main {
    public static void main(String[] args) {
        TipoParametroEntity tp = new TipoParametroEntity();
        tp.setDescripcion("Diablo");
        tp.setEstado("A");
        // prueba
        //cfambio
        TipoParametroDao tpDao = new TipoParametroDao();
        tpDao.persist(tp);
        
        List<TipoParametroEntity> lstTp = new ArrayList<TipoParametroEntity>();
        lstTp=tpDao.findAll();
        
        tp = tpDao.findById(tp.getIdTipoParametro());
        tpDao.delete(tp);
        
    
    }
    
}

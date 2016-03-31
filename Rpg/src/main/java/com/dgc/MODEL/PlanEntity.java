/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.MODEL;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "PLAN")
@NamedQueries({
    @NamedQuery(name = "PlanEntity.findAll", query = "SELECT p FROM PlanEntity p"),
    @NamedQuery(name = "PlanEntity.findByIdPlan", query = "SELECT p FROM PlanEntity p WHERE p.idPlan = :idPlan"),
    @NamedQuery(name = "PlanEntity.findByNombre", query = "SELECT p FROM PlanEntity p WHERE p.nombre = :nombre")})
public class PlanEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PLAN")
    private Long idPlan;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan")
    private List<TiqueteraEntity> tiqueteraEntityList;

    public PlanEntity() {
    }

    public PlanEntity(Long idPlan) {
        this.idPlan = idPlan;
    }

    public PlanEntity(Long idPlan, String nombre) {
        this.idPlan = idPlan;
        this.nombre = nombre;
    }

    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TiqueteraEntity> getTiqueteraEntityList() {
        return tiqueteraEntityList;
    }

    public void setTiqueteraEntityList(List<TiqueteraEntity> tiqueteraEntityList) {
        this.tiqueteraEntityList = tiqueteraEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanEntity)) {
            return false;
        }
        PlanEntity other = (PlanEntity) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.PlanEntity[ idPlan=" + idPlan + " ]";
    }
    
}

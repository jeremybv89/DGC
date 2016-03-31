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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "MODULO")
@NamedQueries({
    @NamedQuery(name = "ModuloEntity.findAll", query = "SELECT m FROM ModuloEntity m"),
    @NamedQuery(name = "ModuloEntity.findByIdModulo", query = "SELECT m FROM ModuloEntity m WHERE m.idModulo = :idModulo"),
    @NamedQuery(name = "ModuloEntity.findByNombre", query = "SELECT m FROM ModuloEntity m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "ModuloEntity.findByModulo", query = "SELECT m FROM ModuloEntity m WHERE m.modulo = :modulo")})
public class ModuloEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MODULO")
    private Long idModulo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "MODULO")
    private String modulo;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL")
    @ManyToOne(optional = false)
    private RolEntity idRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModulo")
    private List<OpcionModuloEntity> opcionModuloEntityList;

    public ModuloEntity() {
    }

    public ModuloEntity(Long idModulo) {
        this.idModulo = idModulo;
    }

    public ModuloEntity(Long idModulo, String nombre, String modulo) {
        this.idModulo = idModulo;
        this.nombre = nombre;
        this.modulo = modulo;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public RolEntity getIdRol() {
        return idRol;
    }

    public void setIdRol(RolEntity idRol) {
        this.idRol = idRol;
    }

    public List<OpcionModuloEntity> getOpcionModuloEntityList() {
        return opcionModuloEntityList;
    }

    public void setOpcionModuloEntityList(List<OpcionModuloEntity> opcionModuloEntityList) {
        this.opcionModuloEntityList = opcionModuloEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModulo != null ? idModulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModuloEntity)) {
            return false;
        }
        ModuloEntity other = (ModuloEntity) object;
        if ((this.idModulo == null && other.idModulo != null) || (this.idModulo != null && !this.idModulo.equals(other.idModulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.ModuloEntity[ idModulo=" + idModulo + " ]";
    }
    
}

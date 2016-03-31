/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.MODEL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "OPCION_MODULO")
@NamedQueries({
    @NamedQuery(name = "OpcionModuloEntity.findAll", query = "SELECT o FROM OpcionModuloEntity o"),
    @NamedQuery(name = "OpcionModuloEntity.findByIdOpcionModulo", query = "SELECT o FROM OpcionModuloEntity o WHERE o.idOpcionModulo = :idOpcionModulo"),
    @NamedQuery(name = "OpcionModuloEntity.findByNombre", query = "SELECT o FROM OpcionModuloEntity o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "OpcionModuloEntity.findByEstado", query = "SELECT o FROM OpcionModuloEntity o WHERE o.estado = :estado")})
public class OpcionModuloEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_OPCION_MODULO")
    private Long idOpcionModulo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_MODULO", referencedColumnName = "ID_MODULO")
    @ManyToOne(optional = false)
    private ModuloEntity idModulo;

    public OpcionModuloEntity() {
    }

    public OpcionModuloEntity(Long idOpcionModulo) {
        this.idOpcionModulo = idOpcionModulo;
    }

    public OpcionModuloEntity(Long idOpcionModulo, String nombre, String estado) {
        this.idOpcionModulo = idOpcionModulo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Long getIdOpcionModulo() {
        return idOpcionModulo;
    }

    public void setIdOpcionModulo(Long idOpcionModulo) {
        this.idOpcionModulo = idOpcionModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ModuloEntity getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(ModuloEntity idModulo) {
        this.idModulo = idModulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpcionModulo != null ? idOpcionModulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcionModuloEntity)) {
            return false;
        }
        OpcionModuloEntity other = (OpcionModuloEntity) object;
        if ((this.idOpcionModulo == null && other.idOpcionModulo != null) || (this.idOpcionModulo != null && !this.idOpcionModulo.equals(other.idOpcionModulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.OpcionModuloEntity[ idOpcionModulo=" + idOpcionModulo + " ]";
    }
    
}

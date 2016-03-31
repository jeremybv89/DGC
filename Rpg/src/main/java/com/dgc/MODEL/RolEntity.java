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
@Table(name = "ROL")
@NamedQueries({
    @NamedQuery(name = "RolEntity.findAll", query = "SELECT r FROM RolEntity r"),
    @NamedQuery(name = "RolEntity.findByIdRol", query = "SELECT r FROM RolEntity r WHERE r.idRol = :idRol"),
    @NamedQuery(name = "RolEntity.findByNombreRol", query = "SELECT r FROM RolEntity r WHERE r.nombreRol = :nombreRol"),
    @NamedQuery(name = "RolEntity.findByEstado", query = "SELECT r FROM RolEntity r WHERE r.estado = :estado")})
public class RolEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ROL")
    private Long idRol;
    @Basic(optional = false)
    @Column(name = "NOMBRE_ROL")
    private String nombreRol;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private List<ModuloEntity> moduloEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private List<UsuarioEntity> usuarioEntityList;

    public RolEntity() {
    }

    public RolEntity(Long idRol) {
        this.idRol = idRol;
    }

    public RolEntity(Long idRol, String nombreRol, String estado) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.estado = estado;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ModuloEntity> getModuloEntityList() {
        return moduloEntityList;
    }

    public void setModuloEntityList(List<ModuloEntity> moduloEntityList) {
        this.moduloEntityList = moduloEntityList;
    }

    public List<UsuarioEntity> getUsuarioEntityList() {
        return usuarioEntityList;
    }

    public void setUsuarioEntityList(List<UsuarioEntity> usuarioEntityList) {
        this.usuarioEntityList = usuarioEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolEntity)) {
            return false;
        }
        RolEntity other = (RolEntity) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.RolEntity[ idRol=" + idRol + " ]";
    }
    
}

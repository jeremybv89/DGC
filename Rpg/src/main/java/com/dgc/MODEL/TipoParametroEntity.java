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
@Table(name = "TIPO_PARAMETRO")
@NamedQueries({
    @NamedQuery(name = "TipoParametroEntity.findAll", query = "SELECT t FROM TipoParametroEntity t"),
    @NamedQuery(name = "TipoParametroEntity.findByIdTipoParametro", query = "SELECT t FROM TipoParametroEntity t WHERE t.idTipoParametro = :idTipoParametro"),
    @NamedQuery(name = "TipoParametroEntity.findByDescripcion", query = "SELECT t FROM TipoParametroEntity t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoParametroEntity.findByEstado", query = "SELECT t FROM TipoParametroEntity t WHERE t.estado = :estado")})
public class TipoParametroEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPO_PARAMETRO")
    private Long idTipoParametro;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoParametro")
    private List<ParametroEntity> parametroEntityList;

    public TipoParametroEntity() {
    }

    public TipoParametroEntity(Long idTipoParametro) {
        this.idTipoParametro = idTipoParametro;
    }

    public TipoParametroEntity(Long idTipoParametro, String descripcion, String estado) {
        this.idTipoParametro = idTipoParametro;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getIdTipoParametro() {
        return idTipoParametro;
    }

    public void setIdTipoParametro(Long idTipoParametro) {
        this.idTipoParametro = idTipoParametro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ParametroEntity> getParametroEntityList() {
        return parametroEntityList;
    }

    public void setParametroEntityList(List<ParametroEntity> parametroEntityList) {
        this.parametroEntityList = parametroEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoParametro != null ? idTipoParametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoParametroEntity)) {
            return false;
        }
        TipoParametroEntity other = (TipoParametroEntity) object;
        if ((this.idTipoParametro == null && other.idTipoParametro != null) || (this.idTipoParametro != null && !this.idTipoParametro.equals(other.idTipoParametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.TipoParametroEntity[ idTipoParametro=" + idTipoParametro + " ]";
    }
    
}

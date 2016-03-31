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
@Table(name = "PARAMETRO")
@NamedQueries({
    @NamedQuery(name = "ParametroEntity.findAll", query = "SELECT p FROM ParametroEntity p"),
    @NamedQuery(name = "ParametroEntity.findByIdParametro", query = "SELECT p FROM ParametroEntity p WHERE p.idParametro = :idParametro"),
    @NamedQuery(name = "ParametroEntity.findByDescripcion", query = "SELECT p FROM ParametroEntity p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "ParametroEntity.findByEstado", query = "SELECT p FROM ParametroEntity p WHERE p.estado = :estado")})
public class ParametroEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PARAMETRO")
    private Long idParametro;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoUsuario")
    private List<UsuarioEntity> usuarioEntityList;
    @JoinColumn(name = "ID_TIPO_PARAMETRO", referencedColumnName = "ID_TIPO_PARAMETRO")
    @ManyToOne(optional = false)
    private TipoParametroEntity idTipoParametro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoHuella")
    private List<HuellaEntity> huellaEntityList;

    public ParametroEntity() {
    }

    public ParametroEntity(Long idParametro) {
        this.idParametro = idParametro;
    }

    public ParametroEntity(Long idParametro, String descripcion, String estado) {
        this.idParametro = idParametro;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getIdParametro() {
        return idParametro;
    }

    public void setIdParametro(Long idParametro) {
        this.idParametro = idParametro;
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

    public List<UsuarioEntity> getUsuarioEntityList() {
        return usuarioEntityList;
    }

    public void setUsuarioEntityList(List<UsuarioEntity> usuarioEntityList) {
        this.usuarioEntityList = usuarioEntityList;
    }

    public TipoParametroEntity getIdTipoParametro() {
        return idTipoParametro;
    }

    public void setIdTipoParametro(TipoParametroEntity idTipoParametro) {
        this.idTipoParametro = idTipoParametro;
    }

    public List<HuellaEntity> getHuellaEntityList() {
        return huellaEntityList;
    }

    public void setHuellaEntityList(List<HuellaEntity> huellaEntityList) {
        this.huellaEntityList = huellaEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParametro != null ? idParametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametroEntity)) {
            return false;
        }
        ParametroEntity other = (ParametroEntity) object;
        if ((this.idParametro == null && other.idParametro != null) || (this.idParametro != null && !this.idParametro.equals(other.idParametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.ParametroEntity[ idParametro=" + idParametro + " ]";
    }
    
}

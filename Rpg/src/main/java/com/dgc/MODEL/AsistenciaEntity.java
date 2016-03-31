/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.MODEL;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "ASISTENCIA")
@NamedQueries({
    @NamedQuery(name = "AsistenciaEntity.findAll", query = "SELECT a FROM AsistenciaEntity a"),
    @NamedQuery(name = "AsistenciaEntity.findByIdAistencia", query = "SELECT a FROM AsistenciaEntity a WHERE a.idAistencia = :idAistencia"),
    @NamedQuery(name = "AsistenciaEntity.findByFecha", query = "SELECT a FROM AsistenciaEntity a WHERE a.fecha = :fecha")})
public class AsistenciaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AISTENCIA")
    private Long idAistencia;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "ID_TIQUETERA", referencedColumnName = "ID_TIQUETERA")
    @ManyToOne(optional = false)
    private TiqueteraEntity idTiquetera;

    public AsistenciaEntity() {
    }

    public AsistenciaEntity(Long idAistencia) {
        this.idAistencia = idAistencia;
    }

    public AsistenciaEntity(Long idAistencia, Date fecha) {
        this.idAistencia = idAistencia;
        this.fecha = fecha;
    }

    public Long getIdAistencia() {
        return idAistencia;
    }

    public void setIdAistencia(Long idAistencia) {
        this.idAistencia = idAistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TiqueteraEntity getIdTiquetera() {
        return idTiquetera;
    }

    public void setIdTiquetera(TiqueteraEntity idTiquetera) {
        this.idTiquetera = idTiquetera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAistencia != null ? idAistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciaEntity)) {
            return false;
        }
        AsistenciaEntity other = (AsistenciaEntity) object;
        if ((this.idAistencia == null && other.idAistencia != null) || (this.idAistencia != null && !this.idAistencia.equals(other.idAistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.AsistenciaEntity[ idAistencia=" + idAistencia + " ]";
    }
    
}

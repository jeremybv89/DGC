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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "HUELLA")
@NamedQueries({
    @NamedQuery(name = "HuellaEntity.findAll", query = "SELECT h FROM HuellaEntity h"),
    @NamedQuery(name = "HuellaEntity.findByIdHuella", query = "SELECT h FROM HuellaEntity h WHERE h.idHuella = :idHuella")})
public class HuellaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_HUELLA")
    private Long idHuella;
    @Basic(optional = false)
    @Lob
    @Column(name = "HUELLA")
    private byte[] huella;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private PersonaEntity idPersona;
    @JoinColumn(name = "ID_TIPO_HUELLA", referencedColumnName = "ID_PARAMETRO")
    @ManyToOne(optional = false)
    private ParametroEntity idTipoHuella;

    public HuellaEntity() {
    }

    public HuellaEntity(Long idHuella) {
        this.idHuella = idHuella;
    }

    public HuellaEntity(Long idHuella, byte[] huella) {
        this.idHuella = idHuella;
        this.huella = huella;
    }

    public Long getIdHuella() {
        return idHuella;
    }

    public void setIdHuella(Long idHuella) {
        this.idHuella = idHuella;
    }

    public byte[] getHuella() {
        return huella;
    }

    public void setHuella(byte[] huella) {
        this.huella = huella;
    }

    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }

    public ParametroEntity getIdTipoHuella() {
        return idTipoHuella;
    }

    public void setIdTipoHuella(ParametroEntity idTipoHuella) {
        this.idTipoHuella = idTipoHuella;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHuella != null ? idHuella.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HuellaEntity)) {
            return false;
        }
        HuellaEntity other = (HuellaEntity) object;
        if ((this.idHuella == null && other.idHuella != null) || (this.idHuella != null && !this.idHuella.equals(other.idHuella))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.HuellaEntity[ idHuella=" + idHuella + " ]";
    }
    
}

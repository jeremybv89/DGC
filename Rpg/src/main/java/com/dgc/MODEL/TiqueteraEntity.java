/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.MODEL;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lenovo 1
 */
@Entity
@Table(name = "TIQUETERA")
@NamedQueries({
    @NamedQuery(name = "TiqueteraEntity.findAll", query = "SELECT t FROM TiqueteraEntity t"),
    @NamedQuery(name = "TiqueteraEntity.findByIdTiquetera", query = "SELECT t FROM TiqueteraEntity t WHERE t.idTiquetera = :idTiquetera"),
    @NamedQuery(name = "TiqueteraEntity.findByValorPlan", query = "SELECT t FROM TiqueteraEntity t WHERE t.valorPlan = :valorPlan"),
    @NamedQuery(name = "TiqueteraEntity.findByFechaPago", query = "SELECT t FROM TiqueteraEntity t WHERE t.fechaPago = :fechaPago"),
    @NamedQuery(name = "TiqueteraEntity.findByNumDiasPlan", query = "SELECT t FROM TiqueteraEntity t WHERE t.numDiasPlan = :numDiasPlan")})
public class TiqueteraEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIQUETERA")
    private Long idTiquetera;
    @Basic(optional = false)
    @Column(name = "VALOR_PLAN")
    private long valorPlan;
    @Basic(optional = false)
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @Column(name = "NUM_DIAS_PLAN")
    private int numDiasPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTiquetera")
    private List<AsistenciaEntity> asistenciaEntityList;
    @JoinColumn(name = "ID_PLAN", referencedColumnName = "ID_PLAN")
    @ManyToOne(optional = false)
    private PlanEntity idPlan;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private PersonaEntity idPersona;

    public TiqueteraEntity() {
    }

    public TiqueteraEntity(Long idTiquetera) {
        this.idTiquetera = idTiquetera;
    }

    public TiqueteraEntity(Long idTiquetera, long valorPlan, Date fechaPago, int numDiasPlan) {
        this.idTiquetera = idTiquetera;
        this.valorPlan = valorPlan;
        this.fechaPago = fechaPago;
        this.numDiasPlan = numDiasPlan;
    }

    public Long getIdTiquetera() {
        return idTiquetera;
    }

    public void setIdTiquetera(Long idTiquetera) {
        this.idTiquetera = idTiquetera;
    }

    public long getValorPlan() {
        return valorPlan;
    }

    public void setValorPlan(long valorPlan) {
        this.valorPlan = valorPlan;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getNumDiasPlan() {
        return numDiasPlan;
    }

    public void setNumDiasPlan(int numDiasPlan) {
        this.numDiasPlan = numDiasPlan;
    }

    public List<AsistenciaEntity> getAsistenciaEntityList() {
        return asistenciaEntityList;
    }

    public void setAsistenciaEntityList(List<AsistenciaEntity> asistenciaEntityList) {
        this.asistenciaEntityList = asistenciaEntityList;
    }

    public PlanEntity getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(PlanEntity idPlan) {
        this.idPlan = idPlan;
    }

    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiquetera != null ? idTiquetera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiqueteraEntity)) {
            return false;
        }
        TiqueteraEntity other = (TiqueteraEntity) object;
        if ((this.idTiquetera == null && other.idTiquetera != null) || (this.idTiquetera != null && !this.idTiquetera.equals(other.idTiquetera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.TiqueteraEntity[ idTiquetera=" + idTiquetera + " ]";
    }
    
}

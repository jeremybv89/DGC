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
@Table(name = "PERSONA")
@NamedQueries({
    @NamedQuery(name = "PersonaEntity.findAll", query = "SELECT p FROM PersonaEntity p"),
    @NamedQuery(name = "PersonaEntity.findByIdPersona", query = "SELECT p FROM PersonaEntity p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "PersonaEntity.findByPNombre", query = "SELECT p FROM PersonaEntity p WHERE p.pNombre = :pNombre"),
    @NamedQuery(name = "PersonaEntity.findBySNombre", query = "SELECT p FROM PersonaEntity p WHERE p.sNombre = :sNombre"),
    @NamedQuery(name = "PersonaEntity.findByPApellido", query = "SELECT p FROM PersonaEntity p WHERE p.pApellido = :pApellido"),
    @NamedQuery(name = "PersonaEntity.findBySApellido", query = "SELECT p FROM PersonaEntity p WHERE p.sApellido = :sApellido"),
    @NamedQuery(name = "PersonaEntity.findByNumeroDocumento", query = "SELECT p FROM PersonaEntity p WHERE p.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "PersonaEntity.findByCelular", query = "SELECT p FROM PersonaEntity p WHERE p.celular = :celular"),
    @NamedQuery(name = "PersonaEntity.findByEmail", query = "SELECT p FROM PersonaEntity p WHERE p.email = :email"),
    @NamedQuery(name = "PersonaEntity.findByDireccion", query = "SELECT p FROM PersonaEntity p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "PersonaEntity.findByTipoDocumento", query = "SELECT p FROM PersonaEntity p WHERE p.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "PersonaEntity.findByEstado", query = "SELECT p FROM PersonaEntity p WHERE p.estado = :estado"),
    @NamedQuery(name = "PersonaEntity.findByNotificaciones", query = "SELECT p FROM PersonaEntity p WHERE p.notificaciones = :notificaciones"),
    @NamedQuery(name = "PersonaEntity.findByFechaRegistro", query = "SELECT p FROM PersonaEntity p WHERE p.fechaRegistro = :fechaRegistro")})
public class PersonaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PERSONA")
    private Long idPersona;
    @Basic(optional = false)
    @Column(name = "P_NOMBRE")
    private String pNombre;
    @Column(name = "S_NOMBRE")
    private String sNombre;
    @Basic(optional = false)
    @Column(name = "P_APELLIDO")
    private String pApellido;
    @Column(name = "S_APELLIDO")
    private String sApellido;
    @Basic(optional = false)
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "NOTIFICACIONES")
    private String notificaciones;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private List<UsuarioEntity> usuarioEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private List<HuellaEntity> huellaEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private List<TiqueteraEntity> tiqueteraEntityList;

    public PersonaEntity() {
    }

    public PersonaEntity(Long idPersona) {
        this.idPersona = idPersona;
    }

    public PersonaEntity(Long idPersona, String pNombre, String pApellido, String numeroDocumento, String estado, Date fechaRegistro) {
        this.idPersona = idPersona;
        this.pNombre = pNombre;
        this.pApellido = pApellido;
        this.numeroDocumento = numeroDocumento;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getPNombre() {
        return pNombre;
    }

    public void setPNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getPApellido() {
        return pApellido;
    }

    public void setPApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getSApellido() {
        return sApellido;
    }

    public void setSApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<UsuarioEntity> getUsuarioEntityList() {
        return usuarioEntityList;
    }

    public void setUsuarioEntityList(List<UsuarioEntity> usuarioEntityList) {
        this.usuarioEntityList = usuarioEntityList;
    }

    public List<HuellaEntity> getHuellaEntityList() {
        return huellaEntityList;
    }

    public void setHuellaEntityList(List<HuellaEntity> huellaEntityList) {
        this.huellaEntityList = huellaEntityList;
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
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEntity)) {
            return false;
        }
        PersonaEntity other = (PersonaEntity) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.PersonaEntity[ idPersona=" + idPersona + " ]";
    }
    
}

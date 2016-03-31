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
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "UsuarioEntity.findAll", query = "SELECT u FROM UsuarioEntity u"),
    @NamedQuery(name = "UsuarioEntity.findByIdUsuario", query = "SELECT u FROM UsuarioEntity u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "UsuarioEntity.findByEmail", query = "SELECT u FROM UsuarioEntity u WHERE u.email = :email"),
    @NamedQuery(name = "UsuarioEntity.findByContrasenia", query = "SELECT u FROM UsuarioEntity u WHERE u.contrasenia = :contrasenia"),
    @NamedQuery(name = "UsuarioEntity.findByFechaRegistro", query = "SELECT u FROM UsuarioEntity u WHERE u.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "UsuarioEntity.findByEstado", query = "SELECT u FROM UsuarioEntity u WHERE u.estado = :estado")})
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "CONTRASENIA")
    private String contrasenia;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL")
    @ManyToOne(optional = false)
    private RolEntity idRol;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private PersonaEntity idPersona;
    @JoinColumn(name = "ID_TIPO_USUARIO", referencedColumnName = "ID_PARAMETRO")
    @ManyToOne(optional = false)
    private ParametroEntity idTipoUsuario;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioEntity(Long idUsuario, String contrasenia, Date fechaRegistro, String estado) {
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public RolEntity getIdRol() {
        return idRol;
    }

    public void setIdRol(RolEntity idRol) {
        this.idRol = idRol;
    }

    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }

    public ParametroEntity getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(ParametroEntity idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity other = (UsuarioEntity) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dgc.rpg.UsuarioEntity[ idUsuario=" + idUsuario + " ]";
    }
    
}

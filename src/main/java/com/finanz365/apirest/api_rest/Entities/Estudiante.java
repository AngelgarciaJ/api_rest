package com.finanz365.apirest.api_rest.Entities;

// import javax.persistence.*;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "beca_id")
    private Beca beca;

    private String facultad;
    private String universidad;
    private String carreraProfesional;
    private Integer ingresoAnio;
    private Integer ingresoMes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    
    
  // Getters and Setters

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Beca getBeca() {
        return beca;
    }
    public void setBeca(Beca beca) {
        this.beca = beca;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getCarreraProfesional() {
        return carreraProfesional;
    }
    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }
    public Integer getIngresoAnio() {
        return ingresoAnio;
    }
    public void setIngresoAnio(Integer ingresoAnio) {
        this.ingresoAnio = ingresoAnio;
    }
    public Integer getIngresoMes() {
        return ingresoMes;
    }
    public void setIngresoMes(Integer ingresoMes) {
        this.ingresoMes = ingresoMes;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Object getNombre() {
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }
    public void setNombre(Object nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
    public Object getCorreo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCorreo'");
    }
    public void setCorreo(Object correo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCorreo'");
    }
    public Object getTelefono() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelefono'");
    }
    public void setTelefono(Object telefono) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTelefono'");
    }



    
}

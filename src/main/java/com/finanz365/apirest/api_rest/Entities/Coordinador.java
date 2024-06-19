package com.finanz365.apirest.api_rest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "coordinadores")
public class Coordinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    private String facultadACargo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor vacío (necesario para JPA)
    public Coordinador() {
    }

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

    public String getFacultadACargo() {
        return facultadACargo;
    }

    public void setFacultadACargo(String facultadACargo) {
        this.facultadACargo = facultadACargo;
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
}










//package com.finanz365.apirest.api_rest.Entities;
//
//// import javax.persistence.*;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "coordinadores")
//public class Coordinador {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    /**
//     error en la columna joinColumn
//     */
//    @ManyToOne
//    @JoinColumn (name = "usuario_id")
//
//
//    private Usuario usuario;
//    private String facultadACargo;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//
//
//    // Getters and Setters
//
//
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public Usuario getUsuario() {
//        return usuario;
//    }
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//    public String getFacultadACargo() {
//        return facultadACargo;
//    }
//    public void setFacultadACargo(String facultadACargo) {
//        this.facultadACargo = facultadACargo;
//    }
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//    public Object getNombre() {
//        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
//    }
//    public void setNombre(Object nombre) {
//        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
//    }
//
//
//
//
//
//
//
//
//}

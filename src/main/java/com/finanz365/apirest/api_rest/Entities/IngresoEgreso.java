package com.finanz365.apirest.api_rest.Entities;

// import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ingresosegresos")
public class IngresoEgreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    private String tipo;
    private String categoria;
    private String descripcion;
    private Double monto;
    private LocalDate fecha;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    
    // Getters and Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

















    

    // // estudiante

    // public Estudiante getEstudiante(){
    //     return estudiante;
    // }
    
    // // tipo
    // public String getTipo() {
    //     return tipo;
    // }

    // public void setTipo(String tipo){
    //     this.tipo = tipo;
    // }

    // // categoria
    // public String getCategoria(){
    //     return categoria;
    // }

    // public void setCategoria(String categoria){
    //     this.categoria = categoria;
    // }
    // // descripcion
    // public String getDescripcion(){
    //     return descripcion;
    // }

    // // monto
    // public Double getMonto(){
    //     return monto;
    // }

    // // fecha
    // public LocalDate getFecha(){
    //     return fecha;
    // }

    // // createdAt
    // public LocalDateTime getCreatedAt(){
    //     return createdAt;
    // }

    // // updatedAt
    // public LocalDateTime getUpdatedAt(){
    //     return updatedAt;
    // }
}


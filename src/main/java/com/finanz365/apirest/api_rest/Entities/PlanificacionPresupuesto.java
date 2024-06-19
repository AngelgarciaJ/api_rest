package com.finanz365.apirest.api_rest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

// Asegúrate de importar la clase Estudiante
import com.finanz365.apirest.api_rest.Entities.Estudiante;

@Entity
@Table(name = "planificacion_presupuesto")
public class PlanificacionPresupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Estudiante estudiante;  // Asegúrate de que el nombre de la clase esté en singular y coincide con tu entidad

    private Integer mes;
    private Integer anio;
    private Double ingresoEstimado;
    private Double gastoEstimado;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor vacío (necesario para JPA)
    public PlanificacionPresupuesto() {
    }

    // Getters y Setters

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

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getIngresoEstimado() {
        return ingresoEstimado;
    }

    public void setIngresoEstimado(Double ingresoEstimado) {
        this.ingresoEstimado = ingresoEstimado;
    }

    public Double getGastoEstimado() {
        return gastoEstimado;
    }

    public void setGastoEstimado(Double gastoEstimado) {
        this.gastoEstimado = gastoEstimado;
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



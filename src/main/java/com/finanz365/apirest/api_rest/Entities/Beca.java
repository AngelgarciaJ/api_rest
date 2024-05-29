package com.finanz365.apirest.api_rest.Entities;

// import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "becas")
public class Beca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String descripcion;
    
     // Getters and Setters
     
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Object getNombre() {
        //p
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }
    public void setNombre(Object nombre) {
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
    public Object getMonto() {
        // los errores 
        throw new UnsupportedOperationException("Unimplemented method 'getMonto'");
    }
    public void setMonto(Object monto) {
        throw new UnsupportedOperationException("Unimplemented method 'setMonto'");
    }
    public Object getDuracion() {
        throw new UnsupportedOperationException("Unimplemented method 'getDuracion'");
    }
    public void setDuracion(Object duracion) {
        // los andes 
        throw new UnsupportedOperationException("Unimplemented method 'setDuracion'");
    }

   



    
}

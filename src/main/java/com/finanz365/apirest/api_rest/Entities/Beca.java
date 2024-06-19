package com.finanz365.apirest.api_rest.Entities;

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

    // Constructor vacío (necesario para JPA)
    public Beca() {
    }

    // Constructor con parámetros
    public Beca(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

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
}







//package com.finanz365.apirest.api_rest.Entities; // este codigo hace parte del paquete Entities
//
//
//// import javax.persistence.*;
//
//// importamos las clases de jakarta persistence
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//
//@Entity
//
//@Table(name = "becas")
//// la clase beca contiene los atributos tipo y descripcion
//// ademas de los metodos get y set para cada uno de ellos
//public class Beca {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String tipo;
//    private String descripcion;
//
//     // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public Object getNombre() {
//        //p
//        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
//    }
//    public void setNombre(Object nombre) {
//        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
//    }
//    public Object getMonto() {
//        // los errores
//        throw new UnsupportedOperationException("Unimplemented method 'getMonto'");
//    }
//    public void setMonto(Object monto) {
//        throw new UnsupportedOperationException("Unimplemented method 'setMonto'");
//    }
//    public Object getDuracion() {
//        throw new UnsupportedOperationException("Unimplemented method 'getDuracion'");
//    }
//    public void setDuracion(Object duracion) {
//        // los andes
//        throw new UnsupportedOperationException("Unimplemented method 'setDuracion'");
//    }
//
//
//}

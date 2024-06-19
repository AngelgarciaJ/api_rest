package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.IngresosEgresos;
import com.finanz365.apirest.api_rest.Repositories.IngresosEgresosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingresosEgresos")
public class IngresosEgresosController {

    @Autowired
    private IngresosEgresosRepository ingresosEgresosRepository;

    @GetMapping
    public List<IngresosEgresos> getAllIngresosEgresos() {
        return ingresosEgresosRepository.findAll();
    }

    @GetMapping("/{id}")
    public IngresosEgresos getIngresosEgresosById(@PathVariable Long id) {
        return ingresosEgresosRepository.findById(id).orElse(null);
    }

    @PostMapping
    public IngresosEgresos createIngresosEgresos(@RequestBody IngresosEgresos ingresosEgresos) {
        return ingresosEgresosRepository.save(ingresosEgresos);
    }

    @PutMapping("/{id}")
    public IngresosEgresos updateIngresosEgresos(@PathVariable Long id, @RequestBody IngresosEgresos ingresosEgresosDetails) {
        IngresosEgresos ingresosEgresos = ingresosEgresosRepository.findById(id).orElse(null);
        if (ingresosEgresos != null) {
            ingresosEgresos.setEstudiante(ingresosEgresosDetails.getEstudiante());
            ingresosEgresos.setTipo(ingresosEgresosDetails.getTipo());
            ingresosEgresos.setCategoria(ingresosEgresosDetails.getCategoria());
            ingresosEgresos.setDescripcion(ingresosEgresosDetails.getDescripcion());
            ingresosEgresos.setMonto(ingresosEgresosDetails.getMonto());
            ingresosEgresos.setFecha(ingresosEgresosDetails.getFecha());
            ingresosEgresos.setCreatedAt(ingresosEgresosDetails.getCreatedAt());
            ingresosEgresos.setUpdatedAt(ingresosEgresosDetails.getUpdatedAt());
            return ingresosEgresosRepository.save(ingresosEgresos);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteIngresosEgresos(@PathVariable Long id) {
        ingresosEgresosRepository.deleteById(id);
    }
}











//package com.finanz365.apirest.api_rest.Controllers;
//
//import com.finanz365.apirest.api_rest.Entities.IngresoEgreso;
//import com.finanz365.apirest.api_rest.Repositories.IngresoEgresoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/ingresoEgresos")
//public class IngresoEgresoController {
//
//    @Autowired
//    private IngresoEgresoRepository ingresoEgresoRepository;
//
//    // get para obtener todos los ingresos y egresos
//    @GetMapping("/ingresosEgresos") // corregir la ruta
//    public List<IngresoEgreso> getAllIngresoEgresos() {
//        return ingresoEgresoRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public IngresoEgreso getIngresoEgresoById(@PathVariable Long id) {
//        return ingresoEgresoRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public IngresoEgreso createIngresoEgreso(@RequestBody IngresoEgreso ingresoEgreso) {
//        return ingresoEgresoRepository.save(ingresoEgreso);
//    }
//
//    @PutMapping("/{id}")
//    public IngresoEgreso updateIngresoEgreso(@PathVariable Long id, @RequestBody IngresoEgreso ingresoEgresoDetails) {
//        IngresoEgreso ingresoEgreso = ingresoEgresoRepository.findById(id).orElse(null);
//        if (ingresoEgreso != null) {
//            ingresoEgreso.setMonto(ingresoEgresoDetails.getMonto());
//            ingresoEgreso.setDescripcion(ingresoEgresoDetails.getDescripcion());
//            ingresoEgreso.setFecha(ingresoEgresoDetails.getFecha());
//            ingresoEgreso.setTipo(ingresoEgresoDetails.getTipo());
//            return ingresoEgresoRepository.save(ingresoEgreso);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteIngresoEgreso(@PathVariable Long id) {
//        ingresoEgresoRepository.deleteById(id);
//    }
//}


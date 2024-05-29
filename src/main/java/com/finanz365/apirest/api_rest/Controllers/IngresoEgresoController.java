package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.IngresoEgreso;
import com.finanz365.apirest.api_rest.Repositories.IngresoEgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingresoEgresos")
public class IngresoEgresoController {

    @Autowired
    private IngresoEgresoRepository ingresoEgresoRepository;

    @GetMapping
    public List<IngresoEgreso> getAllIngresoEgresos() {
        return ingresoEgresoRepository.findAll();
    }

    @GetMapping("/{id}")
    public IngresoEgreso getIngresoEgresoById(@PathVariable Long id) {
        return ingresoEgresoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public IngresoEgreso createIngresoEgreso(@RequestBody IngresoEgreso ingresoEgreso) {
        return ingresoEgresoRepository.save(ingresoEgreso);
    }

    @PutMapping("/{id}")
    public IngresoEgreso updateIngresoEgreso(@PathVariable Long id, @RequestBody IngresoEgreso ingresoEgresoDetails) {
        IngresoEgreso ingresoEgreso = ingresoEgresoRepository.findById(id).orElse(null);
        if (ingresoEgreso != null) {
            ingresoEgreso.setMonto(ingresoEgresoDetails.getMonto());
            ingresoEgreso.setDescripcion(ingresoEgresoDetails.getDescripcion());
            ingresoEgreso.setFecha(ingresoEgresoDetails.getFecha());
            ingresoEgreso.setTipo(ingresoEgresoDetails.getTipo());
            return ingresoEgresoRepository.save(ingresoEgreso);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteIngresoEgreso(@PathVariable Long id) {
        ingresoEgresoRepository.deleteById(id);
    }
}


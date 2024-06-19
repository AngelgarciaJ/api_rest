package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.Beca;
import com.finanz365.apirest.api_rest.Repositories.BecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/becas")
public class BecaController {

    @Autowired
    private BecaRepository becaRepository;

    @GetMapping
    public List<Beca> getAllBecas() {
        return becaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Beca getBecaById(@PathVariable Long id) {
        return becaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Beca createBeca(@RequestBody Beca beca) {
        return becaRepository.save(beca);
    }

    @PutMapping("/{id}")
    public Beca updateBeca(@PathVariable Long id, @RequestBody Beca becaDetails) {
        Beca beca = becaRepository.findById(id).orElse(null);
        if (beca != null) {
            beca.setTipo(becaDetails.getTipo());
            beca.setDescripcion(becaDetails.getDescripcion());
            return becaRepository.save(beca);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBeca(@PathVariable Long id) {
        becaRepository.deleteById(id);
    }
}






















//
//package com.finanz365.apirest.api_rest.Controllers;
//
//import com.finanz365.apirest.api_rest.Entities.Beca;
//import com.finanz365.apirest.api_rest.Repositories.BecaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/becas")
//public class BecaController {
//
//    @Autowired
//    private BecaRepository becaRepository;
//
//    @GetMapping
//    public List<Beca> getAllBecas() {
//        return becaRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Beca getBecaById(@PathVariable Long id) {
//        return becaRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Beca createBeca(@RequestBody Beca beca) {
//        return becaRepository.save(beca);
//    }
//
//    @PutMapping("/{id}")
//    public Beca updateBeca(@PathVariable Long id, @RequestBody Beca becaDetails) {
//        Beca beca = becaRepository.findById(id).orElse(null);
//        if (beca != null) {
//            beca.setNombre(becaDetails.getNombre());
//            beca.setMonto(becaDetails.getMonto());
//            beca.setDuracion(becaDetails.getDuracion());
//            return becaRepository.save(beca);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteBeca(@PathVariable Long id) {
//        becaRepository.deleteById(id);
//    }
//}

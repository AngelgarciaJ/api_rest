package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.Coordinador;
import com.finanz365.apirest.api_rest.Repositories.CoordinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordinadores")
public class CoordinadorController {

    @Autowired
    private CoordinadorRepository coordinadorRepository;

    @GetMapping
    public List<Coordinador> getAllCoordinadores() {
        return coordinadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Coordinador getCoordinadorById(@PathVariable Long id) {
        return coordinadorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Coordinador createCoordinador(@RequestBody Coordinador coordinador) {
        return coordinadorRepository.save(coordinador);
    }

    @PutMapping("/{id}")
    public Coordinador updateCoordinador(@PathVariable Long id, @RequestBody Coordinador coordinadorDetails) {
        Coordinador coordinador = coordinadorRepository.findById(id).orElse(null);
        if (coordinador != null) {
            coordinador.setUsuario(coordinadorDetails.getUsuario());
            coordinador.setFacultadACargo(coordinadorDetails.getFacultadACargo());
            coordinador.setCreatedAt(coordinadorDetails.getCreatedAt());
            coordinador.setUpdatedAt(coordinadorDetails.getUpdatedAt());
            return coordinadorRepository.save(coordinador);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCoordinador(@PathVariable Long id) {
        coordinadorRepository.deleteById(id);
    }
}








//
//package com.finanz365.apirest.api_rest.Controllers;
//
//import com.finanz365.apirest.api_rest.Entities.Coordinador;
//import com.finanz365.apirest.api_rest.Repositories.CoordinadorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/coordinadores")
//public class CoordinadorController {
//
//    @Autowired
//    private CoordinadorRepository coordinadorRepository;
//
//    @GetMapping
//    public List<Coordinador> getAllCoordinadores() {
//        return coordinadorRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Coordinador getCoordinadorById(@PathVariable Long id) {
//        return coordinadorRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Coordinador createCoordinador(@RequestBody Coordinador coordinador) {
//        return coordinadorRepository.save(coordinador);
//    }
//
//    @PutMapping("/{id}")
//    public Coordinador updateCoordinador(@PathVariable Long id, @RequestBody Coordinador coordinadorDetails) {
//        Coordinador coordinador = coordinadorRepository.findById(id).orElse(null);
//        if (coordinador != null) {
//            coordinador.setFacultadACargo(coordinadorDetails.getFacultadACargo());
//            return coordinadorRepository.save(coordinador);
//        }
//        return null;
//    }
//
//    /*
//     * @PutMapping("/{id}") public Coordinador updateCoordinador(@PathVariable Long
//     */
//
//
//    @DeleteMapping("/{id}")
//    public void deleteCoordinador(@PathVariable Long id) {
//        coordinadorRepository.deleteById(id);
//    }
//}

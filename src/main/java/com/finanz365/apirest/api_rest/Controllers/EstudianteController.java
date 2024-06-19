package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.Estudiante;
import com.finanz365.apirest.api_rest.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante getEstudianteById(@PathVariable Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante updateEstudiante(@PathVariable Long id, @RequestBody Estudiante estudianteDetails) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        if (estudiante != null) {
            estudiante.setUsuario(estudianteDetails.getUsuario());
            estudiante.setBeca(estudianteDetails.getBeca());
            estudiante.setFacultad(estudianteDetails.getFacultad());
            estudiante.setUniversidad(estudianteDetails.getUniversidad());
            estudiante.setCarreraProfesional(estudianteDetails.getCarreraProfesional());
            estudiante.setIngresoAnio(estudianteDetails.getIngresoAnio());
            estudiante.setIngresoMes(estudianteDetails.getIngresoMes());
            return estudianteRepository.save(estudiante);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
    }
}





//
//package com.finanz365.apirest.api_rest.Controllers;
//
//import com.finanz365.apirest.api_rest.Entities.Estudiante;
//import com.finanz365.apirest.api_rest.Repositories.EstudianteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/estudiantes")
//public class EstudianteController {
//
//    @Autowired
//    private EstudianteRepository estudianteRepository;
//
//    @GetMapping
//    public List<Estudiante> getAllEstudiantes() {
//        return estudianteRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Estudiante getEstudianteById(@PathVariable Long id) {
//        return estudianteRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Estudiante createEstudiante(@RequestBody Estudiante estudiante) {
//        return estudianteRepository.save(estudiante);
//    }
//
//    @PutMapping("/{id}")
//    public Estudiante updateEstudiante(@PathVariable Long id, @RequestBody Estudiante estudianteDetails) {
//        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
//        if (estudiante != null) {
//            estudiante.setFacultad(estudianteDetails.getFacultad());
//            estudiante.setUniversidad(estudianteDetails.getUniversidad());
//            estudiante.setCarreraProfesional(estudianteDetails.getCarreraProfesional());
//            estudiante.setIngresoAnio(estudianteDetails.getIngresoAnio());
//            estudiante.setIngresoMes(estudianteDetails.getIngresoMes());
//            return estudianteRepository.save(estudiante);
//        }
//        return null;
//    }
//
//
//    @DeleteMapping("/{id}")
//    public void deleteEstudiante(@PathVariable Long id) {
//        estudianteRepository.deleteById(id);
//    }
//}

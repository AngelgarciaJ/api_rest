package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.CoordinadorEstudiantes;
import com.finanz365.apirest.api_rest.Repositories.CoordinadorEstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordinador-estudiantes")
public class CoordinadorEstudiantesController {

    @Autowired
    private CoordinadorEstudiantesRepository coordinadorEstudiantesRepository;

    @GetMapping
    public List<CoordinadorEstudiantes> getAllCoordinadorEstudiantes() {
        return coordinadorEstudiantesRepository.findAll();
    }

    @GetMapping("/{id}")
    public CoordinadorEstudiantes getCoordinadorEstudiantesById(@PathVariable Long id) {
        return coordinadorEstudiantesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public CoordinadorEstudiantes createCoordinadorEstudiantes(@RequestBody CoordinadorEstudiantes coordinadorEstudiantes) {
        return coordinadorEstudiantesRepository.save(coordinadorEstudiantes);
    }

    @PutMapping("/{id}")
    public CoordinadorEstudiantes updateCoordinadorEstudiantes(@PathVariable Long id, @RequestBody CoordinadorEstudiantes coordinadorEstudiantesDetails) {
        CoordinadorEstudiantes coordinadorEstudiantes = coordinadorEstudiantesRepository.findById(id).orElse(null);
        if (coordinadorEstudiantes != null) {
            coordinadorEstudiantes.setEstudiante(coordinadorEstudiantesDetails.getEstudiante());
            coordinadorEstudiantes.setCoordinador(coordinadorEstudiantesDetails.getCoordinador());
            coordinadorEstudiantes.setCreatedAt(coordinadorEstudiantesDetails.getCreatedAt());
            coordinadorEstudiantes.setUpdatedAt(coordinadorEstudiantesDetails.getUpdatedAt());
            return coordinadorEstudiantesRepository.save(coordinadorEstudiantes);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCoordinadorEstudiantes(@PathVariable Long id) {
        coordinadorEstudiantesRepository.deleteById(id);
    }
}


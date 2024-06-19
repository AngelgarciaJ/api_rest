package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.Reportes;
import com.finanz365.apirest.api_rest.Repositories.ReportesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportes")
public class ReportesController {

    @Autowired
    private ReportesRepository reportesRepository;

    @GetMapping
    public List<Reportes> getAllReportes() {
        return reportesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reportes getReportesById(@PathVariable Long id) {
        return reportesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Reportes createReportes(@RequestBody Reportes reportes) {
        return reportesRepository.save(reportes);
    }

    @PutMapping("/{id}")
    public Reportes updateReportes(@PathVariable Long id, @RequestBody Reportes reportesDetails) {
        Reportes reportes = reportesRepository.findById(id).orElse(null);
        if (reportes != null) {
            reportes.setUsuario(reportesDetails.getUsuario());
            reportes.setTipo(reportesDetails.getTipo());
            reportes.setContenido(reportesDetails.getContenido());
            reportes.setFechaGeneracion(reportesDetails.getFechaGeneracion());
            return reportesRepository.save(reportes);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteReportes(@PathVariable Long id) {
        reportesRepository.deleteById(id);
    }
}


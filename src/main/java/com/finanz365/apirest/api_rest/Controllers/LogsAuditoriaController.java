package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.LogsAuditoria;
import com.finanz365.apirest.api_rest.Repositories.LogsAuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs-auditoria")
public class LogsAuditoriaController {

    @Autowired
    private LogsAuditoriaRepository logsAuditoriaRepository;

    @GetMapping
    public List<LogsAuditoria> getAllLogsAuditoria() {
        return logsAuditoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public LogsAuditoria getLogsAuditoriaById(@PathVariable Long id) {
        return logsAuditoriaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public LogsAuditoria createLogsAuditoria(@RequestBody LogsAuditoria logsAuditoria) {
        return logsAuditoriaRepository.save(logsAuditoria);
    }

    @PutMapping("/{id}")
    public LogsAuditoria updateLogsAuditoria(@PathVariable Long id, @RequestBody LogsAuditoria logsAuditoriaDetails) {
        LogsAuditoria logsAuditoria = logsAuditoriaRepository.findById(id).orElse(null);
        if (logsAuditoria != null) {
            logsAuditoria.setUsuario(logsAuditoriaDetails.getUsuario());
            logsAuditoria.setAccion(logsAuditoriaDetails.getAccion());
            logsAuditoria.setDescripcion(logsAuditoriaDetails.getDescripcion());
            logsAuditoria.setFechaHora(logsAuditoriaDetails.getFechaHora());
            return logsAuditoriaRepository.save(logsAuditoria);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLogsAuditoria(@PathVariable Long id) {
        logsAuditoriaRepository.deleteById(id);
    }
}

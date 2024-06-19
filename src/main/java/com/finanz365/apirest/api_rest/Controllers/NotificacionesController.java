package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.Notificaciones;
import com.finanz365.apirest.api_rest.Repositories.NotificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {

    @Autowired
    private NotificacionesRepository notificacionesRepository;

    @GetMapping
    public List<Notificaciones> getAllNotificaciones() {
        return notificacionesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Notificaciones getNotificacionesById(@PathVariable Long id) {
        return notificacionesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Notificaciones createNotificaciones(@RequestBody Notificaciones notificaciones) {
        return notificacionesRepository.save(notificaciones);
    }

    @PutMapping("/{id}")
    public Notificaciones updateNotificaciones(@PathVariable Long id, @RequestBody Notificaciones notificacionesDetails) {
        Notificaciones notificaciones = notificacionesRepository.findById(id).orElse(null);
        if (notificaciones != null) {
            notificaciones.setUsuario(notificacionesDetails.getUsuario());
            notificaciones.setMensaje(notificacionesDetails.getMensaje());
            notificaciones.setFechaEnvio(notificacionesDetails.getFechaEnvio());
            notificaciones.setLeido(notificacionesDetails.getLeido());
            return notificacionesRepository.save(notificaciones);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteNotificaciones(@PathVariable Long id) {
        notificacionesRepository.deleteById(id);
    }
}

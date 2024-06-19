package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.Notificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionesRepository extends JpaRepository<Notificaciones, Long> {
}


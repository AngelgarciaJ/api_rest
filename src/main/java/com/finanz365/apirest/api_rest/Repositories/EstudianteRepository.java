package com.finanz365.apirest.api_rest.Repositories;


import com.finanz365.apirest.api_rest.Entities.Estudiante; // ruta 

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}


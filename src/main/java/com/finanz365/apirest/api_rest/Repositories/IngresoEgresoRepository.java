package com.finanz365.apirest.api_rest.Repositories;


import com.finanz365.apirest.api_rest.Entities.IngresoEgreso; // ruta

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoEgresoRepository extends JpaRepository<IngresoEgreso, Long> {
}


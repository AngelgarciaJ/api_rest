package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.Beca; // ruta 
import org.springframework.data.jpa.repository.JpaRepository;

public interface BecaRepository extends JpaRepository<Beca, Long> {
}


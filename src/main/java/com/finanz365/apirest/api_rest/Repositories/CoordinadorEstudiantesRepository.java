package com.finanz365.apirest.api_rest.Repositories;

// paquetes necesarios
import com.finanz365.apirest.api_rest.Entities.CoordinadorEstudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinadorEstudiantesRepository extends JpaRepository<CoordinadorEstudiantes, Long> {
}

package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.PlanificacionPresupuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanificacionPresupuestoRepository extends JpaRepository<PlanificacionPresupuesto, Long> {
}


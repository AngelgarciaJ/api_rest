package com.finanz365.apirest.api_rest.Controllers;

import com.finanz365.apirest.api_rest.Entities.PlanificacionPresupuesto;
import com.finanz365.apirest.api_rest.Repositories.PlanificacionPresupuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planificacion_presupuesto")
public class PlanificacionPresupuestoController {

    @Autowired
    private PlanificacionPresupuestoRepository planificacionPresupuestoRepository;

    @GetMapping
    public List<PlanificacionPresupuesto> getAllPlanificaciones() {
        return planificacionPresupuestoRepository.findAll();
    }

    @GetMapping("/{id}")
    public PlanificacionPresupuesto getPlanificacionById(@PathVariable Long id) {
        return planificacionPresupuestoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public PlanificacionPresupuesto createPlanificacion(@RequestBody PlanificacionPresupuesto planificacion) {
        return planificacionPresupuestoRepository.save(planificacion);
    }

    @PutMapping("/{id}")
    public PlanificacionPresupuesto updatePlanificacion(@PathVariable Long id, @RequestBody PlanificacionPresupuesto planificacionDetails) {
        PlanificacionPresupuesto planificacion = planificacionPresupuestoRepository.findById(id).orElse(null);
        if (planificacion != null) {
            planificacion.setEstudiante(planificacionDetails.getEstudiante());
            planificacion.setMes(planificacionDetails.getMes());
            planificacion.setAnio(planificacionDetails.getAnio());
            planificacion.setIngresoEstimado(planificacionDetails.getIngresoEstimado());
            planificacion.setGastoEstimado(planificacionDetails.getGastoEstimado());
            planificacion.setCreatedAt(planificacionDetails.getCreatedAt());
            planificacion.setUpdatedAt(planificacionDetails.getUpdatedAt());
            return planificacionPresupuestoRepository.save(planificacion);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePlanificacion(@PathVariable Long id) {
        planificacionPresupuestoRepository.deleteById(id);
    }
}










//package com.finanz365.apirest.api_rest.Controllers;
//
//import com.finanz365.apirest.api_rest.Entities.PlanificacionPresupuesto;
//import com.finanz365.apirest.api_rest.Repositories.PlanificacionPresupuestoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/planificacion_presupuesto")
//public class PlanificacionPresupuestoController {
//
//    @Autowired
//    private PlanificacionPresupuestoRepository planificacionPresupuestoRepository;
//
//    @GetMapping
//    public List<PlanificacionPresupuesto> getAllPlanificaciones() {
//        return planificacionPresupuestoRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public PlanificacionPresupuesto getPlanificacionById(@PathVariable Long id) {
//        return planificacionPresupuestoRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public PlanificacionPresupuesto createPlanificacion(@RequestBody PlanificacionPresupuesto planificacion) {
//        return planificacionPresupuestoRepository.save(planificacion);
//    }
//
//    @PutMapping("/{id}")
//    public PlanificacionPresupuesto updatePlanificacion(@PathVariable Long id, @RequestBody PlanificacionPresupuesto planificacionDetails) {
//        PlanificacionPresupuesto planificacion = planificacionPresupuestoRepository.findById(id).orElse(null);
//        if (planificacion != null) {
//            planificacion.setEstudiante(planificacionDetails.getEstudiante());
//            planificacion.setMes(planificacionDetails.getMes());
//            planificacion.setAnio(planificacionDetails.getAnio());
//            planificacion.setIngresoEstimado(planificacionDetails.getIngresoEstimado());
//            planificacion.setGastoEstimado(planificacionDetails.getGastoEstimado());
//            planificacion.setCreatedAt(planificacionDetails.getCreatedAt());
//            planificacion.setUpdatedAt(planificacionDetails.getUpdatedAt());
//            return planificacionPresupuestoRepository.save(planificacion);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletePlanificacion(@PathVariable Long id) {
//        planificacionPresupuestoRepository.deleteById(id);
//    }
//}

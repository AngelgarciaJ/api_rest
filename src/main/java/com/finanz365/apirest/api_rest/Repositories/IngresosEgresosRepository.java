package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.IngresosEgresos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresosEgresosRepository extends JpaRepository<IngresosEgresos, Long> {
}





//package com.finanz365.apirest.api_rest.Repositories;
//
//// esto es para importar la clase IngresoEgreso
//
//import com.finanz365.apirest.api_rest.Entities.IngresoEgreso; // ruta
//
//// esto es para importar la clase JpaRepository ; funciona como una interfaz que nos permite realizar operaciones CRUD en la base de datos
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface IngresoEgresoRepository extends JpaRepository<IngresoEgreso, Long> {
//}


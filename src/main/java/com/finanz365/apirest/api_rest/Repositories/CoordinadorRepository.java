package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.Coordinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {
}







//package com.finanz365.apirest.api_rest.Repositories;
//
//
//import com.finanz365.apirest.api_rest.Entities.Coordinador;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {
//}

package com.finanz365.apirest.api_rest.Repositories;


import com.finanz365.apirest.api_rest.Entities.Usuario; // corregir la ruta  entities
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}


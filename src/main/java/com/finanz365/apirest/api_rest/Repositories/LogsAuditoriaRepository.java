package com.finanz365.apirest.api_rest.Repositories;

import com.finanz365.apirest.api_rest.Entities.LogsAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsAuditoriaRepository extends JpaRepository<LogsAuditoria, Long> {
}

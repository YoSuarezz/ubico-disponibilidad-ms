package co.edu.uco.ubico.application.secondaryports.repository;


import co.edu.uco.ubico.application.secondaryports.entity.AulaEntity;

import java.util.List;

public interface AulaRepositoryCustom {
    List<AulaEntity> findByFilter(AulaEntity filter);
}
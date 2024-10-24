package co.edu.uco.ubico.application.secondaryports.repository;

import co.edu.uco.ubico.application.secondaryports.entity.DisponibilidadEntity;

import java.util.List;

public interface DisponibilidadRepositoryCustom {
    List<DisponibilidadEntity> findByFilter(DisponibilidadEntity filter);
}

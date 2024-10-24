package co.edu.uco.ubico.infrastructure.secondaryadapters.mappers;

import co.edu.uco.ubico.crosscutting.enums.DisponibilidadEstado;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.infrastructure.secondaryadapters.entity.DisponibilidadEntity;

public class DisponibilidadEntityMapper {
    private DisponibilidadEntityMapper() {
    }

    public static DisponibilidadEntity toEntity(DisponibilidadDomain domain) {
        if (domain == null) {
            return null;
        }

        DisponibilidadEntity entity = new DisponibilidadEntity();
        entity.setId(domain.getId());
        entity.setAula(AulaEntityMapper.toEntity(domain.getAula()));
        entity.setFechaInicio(domain.getFechaInicio());
        entity.setFechaFin(domain.getFechaFin());
        entity.setEstado(domain.getEstado() != null ? domain.getEstado().name() : null);
        return entity;
    }

    public static DisponibilidadDomain toDomain(DisponibilidadEntity entity) {
        if (entity == null) {
            return null;
        }

        DisponibilidadDomain domain = new DisponibilidadDomain(entity.getId());
        domain.setAula(AulaEntityMapper.toDomain(entity.getAula()));
        domain.setFechaInicio(entity.getFechaInicio());
        domain.setFechaFin(entity.getFechaFin());
        domain.setEstado(entity.getEstado() != null ? DisponibilidadEstado.valueOf(entity.getEstado()) : null);
        return domain;
    }
}

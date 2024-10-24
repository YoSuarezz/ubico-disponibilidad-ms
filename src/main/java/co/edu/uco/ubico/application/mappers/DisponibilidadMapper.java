package co.edu.uco.ubico.application.mappers;

import co.edu.uco.ubico.application.dto.DisponibilidadDTO;
import co.edu.uco.ubico.crosscutting.enums.DisponibilidadEstado;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;

public class DisponibilidadMapper {
    private DisponibilidadMapper() {
    }

    public static DisponibilidadDTO toDTO(DisponibilidadDomain domain) {
        if (domain == null) {
            return null;
        }

        DisponibilidadDTO dto = new DisponibilidadDTO();
        dto.setId(domain.getId());
        dto.setAulaId(domain.getAula() != null ? domain.getAula().getId() : null);
        dto.setFechaInicio(domain.getFechaInicio());
        dto.setFechaFin(domain.getFechaFin());
        dto.setEstado(domain.getEstado() != null ? domain.getEstado().name() : null);
        return dto;
    }

    public static DisponibilidadDomain toDomain(DisponibilidadDTO dto) {
        if (dto == null) {
            return null;
        }

        DisponibilidadDomain domain = new DisponibilidadDomain(dto.getId());
        // Necesitarás obtener la instancia de AulaDomain por su ID
        domain.setFechaInicio(dto.getFechaInicio());
        domain.setFechaFin(dto.getFechaFin());
        domain.setEstado(dto.getEstado() != null ? DisponibilidadEstado.valueOf(dto.getEstado()) : null);
        return domain;
    }
}
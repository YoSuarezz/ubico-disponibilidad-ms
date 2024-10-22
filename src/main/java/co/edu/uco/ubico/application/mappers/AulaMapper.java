package co.edu.uco.ubico.application.mappers;

import co.edu.uco.ubico.application.dto.AulaDTO;
import co.edu.uco.ubico.domain.aula.AulaDomain;

public class AulaMapper {
    private AulaMapper() {}

    public static AulaDTO toDTO(AulaDomain domain) {
        if (domain == null) {
            return null;
        }

        AulaDTO dto = new AulaDTO();
        dto.setId(domain.getId());
        dto.setName(domain.getName());
        dto.setBloqueId(domain.getBloque() != null ? domain.getBloque().getId() : null);
        dto.setTipoAulaId(domain.getTipoDeAula() != null ? domain.getTipoDeAula().getId() : null);
        dto.setCapacidad(domain.getCapacidad());
        return dto;
    }

    public static AulaDomain toDomain(AulaDTO dto) {
        if (dto == null) {
            return null;
        }

        AulaDomain domain = new AulaDomain(dto.getId());
        domain.setName(dto.getName());
        // Aquí necesitarás obtener las instancias de BloqueDomain y TipoAulaDomain por sus IDs
        // Esto generalmente se hace a través de servicios o repositorios
        domain.setCapacidad(dto.getCapacidad());
        return domain;
    }
}
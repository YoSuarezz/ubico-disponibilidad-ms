package co.edu.uco.ubico.application.mappers;

import co.edu.uco.ubico.application.dto.TipoAulaDTO;
import co.edu.uco.ubico.domain.tipoaula.TipoAulaDomain;

public class TipoAulaMapper {

    public static TipoAulaDTO toDTO(TipoAulaDomain domain) {
        if (domain == null) {
            return null;
        }

        TipoAulaDTO dto = new TipoAulaDTO();
        dto.setId(domain.getId());
        dto.setName(domain.getName());
        return dto;
    }

    public static TipoAulaDomain toDomain(TipoAulaDTO dto) {
        if (dto == null) {
            return null;
        }

        TipoAulaDomain domain = new TipoAulaDomain(dto.getId());
        domain.setName(dto.getName());
        return domain;
    }
}

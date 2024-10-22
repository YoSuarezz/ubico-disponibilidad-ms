package co.edu.uco.ubico.infrastructure.secondaryadapters.mappers;

import co.edu.uco.ubico.domain.tipoaula.TipoAulaDomain;
import co.edu.uco.ubico.infrastructure.secondaryadapters.entity.TipoAulaEntity;

public class TipoAulaEntityMapper {

    public static TipoAulaEntity toEntity(TipoAulaDomain domain) {
        if (domain == null) {
            return null;
        }

        TipoAulaEntity entity = new TipoAulaEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        return entity;
    }

    public static TipoAulaDomain toDomain(TipoAulaEntity entity) {
        if (entity == null) {
            return null;
        }

        TipoAulaDomain domain = new TipoAulaDomain(entity.getId());
        domain.setName(entity.getName());
        return domain;
    }
}
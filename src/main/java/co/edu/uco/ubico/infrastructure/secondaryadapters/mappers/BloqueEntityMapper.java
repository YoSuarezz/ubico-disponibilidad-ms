package co.edu.uco.ubico.infrastructure.secondaryadapters.mappers;

import co.edu.uco.ubico.domain.bloque.BloqueDomain;
import co.edu.uco.ubico.infrastructure.secondaryadapters.entity.BloqueEntity;

public class BloqueEntityMapper {

    public static BloqueEntity toEntity(BloqueDomain domain) {
        if (domain == null) {
            return null;
        }

        BloqueEntity entity = new BloqueEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        return entity;
    }

    public static BloqueDomain toDomain(BloqueEntity entity) {
        if (entity == null) {
            return null;
        }

        BloqueDomain domain = new BloqueDomain(entity.getId());
        domain.setName(entity.getName());
        return domain;
    }
}
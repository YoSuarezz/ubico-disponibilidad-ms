package co.edu.uco.ubico.infrastructure.secondaryadapters.mappers;

import co.edu.uco.ubico.domain.aula.AulaDomain;
import co.edu.uco.ubico.infrastructure.secondaryadapters.entity.AulaEntity;

public class AulaEntityMapper {

    public static AulaEntity toEntity(AulaDomain domain) {
        if (domain == null) {
            return null;
        }

        AulaEntity entity = new AulaEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        entity.setCapacidad(domain.getCapacidad());
        // Mapear BloqueDomain a BloqueEntity
        entity.setBloque(BloqueEntityMapper.toEntity(domain.getBloque()));
        // Mapear TipoAulaDomain a TipoAulaEntity
        entity.setTipoAula(TipoAulaEntityMapper.toEntity(domain.getTipoDeAula()));
        return entity;
    }

    public static AulaDomain toDomain(AulaEntity entity) {
        if (entity == null) {
            return null;
        }

        AulaDomain domain = new AulaDomain(entity.getId());
        domain.setName(entity.getName());
        domain.setCapacidad(entity.getCapacidad());
        // Mapear BloqueEntity a BloqueDomain
        domain.setBloque(BloqueEntityMapper.toDomain(entity.getBloque()));
        // Mapear TipoAulaEntity a TipoAulaDomain
        domain.setTipoDeAula(TipoAulaEntityMapper.toDomain(entity.getTipoAula()));
        return domain;
    }
}

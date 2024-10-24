package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.secondaryports.entity.AulaEntity;
import co.edu.uco.ubico.domain.aula.AulaDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AulaEntityMapper {

    AulaEntityMapper INSTANCE = Mappers.getMapper(AulaEntityMapper.class);

    AulaDomain toDomain(AulaEntity entity);

    AulaEntity toEntity(AulaDomain domain);

    List<AulaDomain> toDomainCollection(List<AulaEntity> entityCollection);

    List<AulaEntity> toEntityCollection(List<AulaDomain> domainCollection);
}
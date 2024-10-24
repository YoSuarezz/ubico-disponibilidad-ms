package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.secondaryports.entity.DisponibilidadEntity;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = { AulaEntityMapper.class })
public interface DisponibilidadEntityMapper {

    DisponibilidadEntityMapper INSTANCE = Mappers.getMapper(DisponibilidadEntityMapper.class);

    DisponibilidadDomain toDomain(DisponibilidadEntity entity);

    DisponibilidadEntity toEntity(DisponibilidadDomain domain);

    List<DisponibilidadDomain> toDomainCollection(List<DisponibilidadEntity> entityCollection);

    List<DisponibilidadEntity> toEntityCollection(List<DisponibilidadDomain> domainCollection);
}
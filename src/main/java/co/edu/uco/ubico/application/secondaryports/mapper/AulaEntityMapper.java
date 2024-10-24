package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.primaryports.dto.AulaDTO;
import co.edu.uco.ubico.application.secondaryports.entity.AulaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AulaEntityMapper {

    AulaEntityMapper INSTANCE = Mappers.getMapper(AulaEntityMapper.class);

    AulaDTO toDto(AulaEntity entity);

    AulaEntity toEntity(AulaDTO dto);

    List<AulaDTO> toDtoList(List<AulaEntity> entities);

    List<AulaEntity> toEntityList(List<AulaDTO> dtos);
}
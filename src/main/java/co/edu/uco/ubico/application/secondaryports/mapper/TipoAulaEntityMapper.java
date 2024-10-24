package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.primaryports.dto.TipoAulaDTO;
import co.edu.uco.ubico.application.secondaryports.entity.TipoAulaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoAulaEntityMapper {

    TipoAulaEntityMapper INSTANCE = Mappers.getMapper(TipoAulaEntityMapper.class);

    TipoAulaDTO toDto(TipoAulaEntity entity);

    TipoAulaEntity toEntity(TipoAulaDTO dto);

    List<TipoAulaDTO> toDtoList(List<TipoAulaEntity> entities);

    List<TipoAulaEntity> toEntityList(List<TipoAulaDTO> dtos);
}
package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.primaryports.dto.DisponibilidadDTO;
import co.edu.uco.ubico.application.secondaryports.entity.DisponibilidadEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DisponibilidadEntityMapper {

    DisponibilidadEntityMapper INSTANCE = Mappers.getMapper(DisponibilidadEntityMapper.class);

    DisponibilidadDTO toDto(DisponibilidadEntity entity);

    DisponibilidadEntity toEntity(DisponibilidadDTO dto);

    List<DisponibilidadDTO> toDtoList(List<DisponibilidadEntity> entities);

    List<DisponibilidadEntity> toEntityList(List<DisponibilidadDTO> dtos);
}
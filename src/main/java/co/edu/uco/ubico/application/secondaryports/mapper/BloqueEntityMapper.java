package co.edu.uco.ubico.application.secondaryports.mapper;

import co.edu.uco.ubico.application.primaryports.dto.BloqueDTO;
import co.edu.uco.ubico.application.secondaryports.entity.BloqueEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BloqueEntityMapper {

    BloqueEntityMapper INSTANCE = Mappers.getMapper(BloqueEntityMapper.class);

    BloqueDTO toDto(BloqueEntity entity);

    BloqueEntity toEntity(BloqueDTO dto);

    List<BloqueDTO> toDtoList(List<BloqueEntity> entities);

    List<BloqueEntity> toEntityList(List<BloqueDTO> dtos);
}
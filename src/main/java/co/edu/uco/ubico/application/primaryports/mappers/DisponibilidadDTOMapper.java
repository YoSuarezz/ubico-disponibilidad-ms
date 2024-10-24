package co.edu.uco.ubico.application.primaryports.mappers;

import co.edu.uco.ubico.application.primaryports.dto.DisponibilidadDTO;
import co.edu.uco.ubico.domain.bloque.BloqueDomain;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
interface DisponibilidadDTOMapper {

    DisponibilidadDTOMapper INSTANCE = Mappers.getMapper(DisponibilidadDTOMapper.class);

    DisponibilidadDTO toDto(DisponibilidadDomain domain);

    DisponibilidadDomain toDomain(DisponibilidadDTO dto);

    List<DisponibilidadDTO> toDTOCollection(List<DisponibilidadDomain> domainCollection);

    List<DisponibilidadDomain> toDomainCollection(List<DisponibilidadDTO> dtoCollection);}
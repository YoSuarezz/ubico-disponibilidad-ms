package co.edu.uco.ubico.application.primaryports.mapper;

import co.edu.uco.ubico.application.primaryports.dto.AulaDTO;
import co.edu.uco.ubico.domain.aula.AulaDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AulaDTOMapper {

    AulaDTOMapper INSTANCE = Mappers.getMapper(AulaDTOMapper.class);

    AulaDTO toDto(AulaDomain domain);

    AulaDomain toDomain(AulaDTO dto);

    List<AulaDTO> toDTOCollection(List<AulaDomain> domainCollection);

    List<AulaDomain> toDomainCollection(List<AulaDTO> dtoCollection);
}

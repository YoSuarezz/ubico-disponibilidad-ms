package co.edu.uco.ubico.application.primaryports.interactor.disponibilidad.impl;

import co.edu.uco.ubico.application.primaryports.dto.DisponibilidadDTO;
import co.edu.uco.ubico.application.primaryports.interactor.disponibilidad.RegisterNewDisponibilidadInteractor;
import co.edu.uco.ubico.application.primaryports.mapper.DisponibilidadDTOMapper;
import co.edu.uco.ubico.application.secondaryports.entity.AulaEntity;
import co.edu.uco.ubico.application.secondaryports.mapper.AulaEntityMapper;
import co.edu.uco.ubico.application.secondaryports.repository.AulaRepository;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidad;
import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;
import co.edu.uco.ubico.domain.aula.AulaDomain;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterNewDisponibilidadInteractorImpl implements RegisterNewDisponibilidadInteractor {

    private final RegisterNewDisponibilidad registerNewDisponibilidad;
    private final DisponibilidadDTOMapper disponibilidadDTOMapper;
    private final AulaRepository aulaRepository;
    private final AulaEntityMapper aulaEntityMapper;

    public RegisterNewDisponibilidadInteractorImpl(RegisterNewDisponibilidad registerNewDisponibilidad,
                                                   DisponibilidadDTOMapper disponibilidadDTOMapper,
                                                   AulaRepository aulaRepository,
                                                   AulaEntityMapper aulaEntityMapper) {
        this.registerNewDisponibilidad = registerNewDisponibilidad;
        this.disponibilidadDTOMapper = disponibilidadDTOMapper;
        this.aulaRepository = aulaRepository;
        this.aulaEntityMapper = aulaEntityMapper;
    }

    @Override
    public void execute(DisponibilidadDTO data) {
        // Validar que el DTO contenga un ID de Aula válido
        if (data.getAula() == null || data.getAula().getId() == null) {
            throw new RuleUbicoException("El ID del aula es requerido para registrar la disponibilidad.",
                    "El DTO de Disponibilidad no contiene un ID de Aula válido.", null);
        }

        UUID aulaId = data.getAula().getId();

        // Consultar el Aula desde la base de datos
        AulaEntity aulaEntity = aulaRepository.findById(aulaId)
                .orElseThrow(() -> new RuleUbicoException(
                        "El aula con ID " + aulaId + " no existe.",
                        "No se encontró un Aula con el ID proporcionado en la base de datos.",
                        null
                ));

        // Mapear AulaEntity a AulaDomain
        AulaDomain aulaDomain = aulaEntityMapper.toDomain(aulaEntity);

        // Mapear DisponibilidadDTO a DisponibilidadDomain
        DisponibilidadDomain disponibilidadDomain = disponibilidadDTOMapper.toDomain(data);
        disponibilidadDomain.setAula(aulaDomain);

        // Ejecutar el caso de uso para registrar la disponibilidad
        registerNewDisponibilidad.execute(disponibilidadDomain);
    }
}
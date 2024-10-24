package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.secondaryports.mapper.DisponibilidadEntityMapper;
import co.edu.uco.ubico.application.secondaryports.repository.DisponibilidadRepository;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidad;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewDisponibilidadImpl implements RegisterNewDisponibilidad {

    private final DisponibilidadRepository disponibilidadRepository;
    private final DisponibilidadEntityMapper disponibilidadEntityMapper;

    public RegisterNewDisponibilidadImpl(DisponibilidadRepository disponibilidadRepository,
                                            DisponibilidadEntityMapper disponibilidadEntityMapper) {
        this.disponibilidadRepository = disponibilidadRepository;
        this.disponibilidadEntityMapper = disponibilidadEntityMapper;
    }

    @Override
    public void execute(DisponibilidadDomain disponibilidad) {
        // Mapear Domain a Entity
        var disponibilidadEntity = disponibilidadEntityMapper.toEntity(disponibilidad);

        // Persistir en la base de datos
        disponibilidadRepository.save(disponibilidadEntity);
    }
}

package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadFechaInicioRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadFechaInicioRulesValidatorImpl implements RegisterNewDisponibilidadFechaInicioRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        if (disponibilidad.getFechaInicio() == null) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser nula.");
        }
    }
}

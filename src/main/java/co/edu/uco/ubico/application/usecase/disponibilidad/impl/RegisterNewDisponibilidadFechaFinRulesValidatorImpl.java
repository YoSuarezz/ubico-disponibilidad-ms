package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadFechaFinRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadFechaFinRulesValidatorImpl implements RegisterNewDisponibilidadFechaFinRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        if (disponibilidad.getFechaFin() == null) {
            throw new IllegalArgumentException("La fecha de fin no puede ser nula.");
        }
    }
}
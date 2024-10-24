package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadIdRulesValidatorImpl implements RegisterNewDisponibilidadRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        // Validar que el ID no sea el valor por defecto
        if (disponibilidad.getId() == null || disponibilidad.getId().toString().isEmpty()) {
            throw new IllegalArgumentException("El ID de la disponibilidad no puede ser nulo o vacío.");
        }
    }
}
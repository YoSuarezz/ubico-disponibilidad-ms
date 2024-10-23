package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadAulaRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadAulaRulesValidatorImpl implements RegisterNewDisponibilidadAulaRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        // Validar que el aula no sea nula
        if (disponibilidad.getAula() == null) {
            throw new IllegalArgumentException("El aula asociada a la disponibilidad no puede ser nula.");
        }
    }
}

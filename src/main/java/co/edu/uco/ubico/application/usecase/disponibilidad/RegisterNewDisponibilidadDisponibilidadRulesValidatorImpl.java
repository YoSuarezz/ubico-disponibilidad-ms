package co.edu.uco.ubico.application.usecase.disponibilidad;

import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadDisponibilidadRulesValidatorImpl implements RegisterNewDisponibilidadDisponibilidadRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        // Lógica para validar la disponibilidad
        if (disponibilidad == null) {
            throw new IllegalArgumentException("La disponibilidad no puede ser nula.");
        }
    }
}

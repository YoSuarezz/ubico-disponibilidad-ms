package co.edu.uco.ubico.application.usecase.disponibilidad;

import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadEstadoRulesValidatorImpl implements RegisterNewDisponibilidadEstadoRulesValidator {

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        // Lógica para validar el estado de la disponibilidad
        if (disponibilidad.getEstado() == null || !disponibilidad.getEstado().esValido()) {
            throw new IllegalArgumentException("El estado de la disponibilidad no es válido.");
        }
    }
}

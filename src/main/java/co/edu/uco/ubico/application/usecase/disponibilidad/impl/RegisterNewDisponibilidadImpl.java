package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidad;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadDisponibilidadRulesValidator;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadEstadoRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadImpl implements RegisterNewDisponibilidad {

    @Override
    public void execute(DisponibilidadDomain domain) {

    }

    @Component
    public static class RegisterNewDisponibilidadEstadoRulesValidatorImpl implements RegisterNewDisponibilidadEstadoRulesValidator {

        @Override
        public void validate(DisponibilidadDomain disponibilidad) {
            // Lógica para validar el estado de la disponibilidad
            if (disponibilidad.getEstado() == null || !disponibilidad.getEstado().esValido()) {
                throw new IllegalArgumentException("El estado de la disponibilidad no es válido.");
            }
        }
    }

    @Component
    public static class RegisterNewDisponibilidadDisponibilidadRulesValidatorImpl implements RegisterNewDisponibilidadDisponibilidadRulesValidator {

        @Override
        public void validate(DisponibilidadDomain disponibilidad) {
            // Lógica para validar la disponibilidad
            if (disponibilidad == null) {
                throw new IllegalArgumentException("La disponibilidad no puede ser nula.");
            }
        }
    }
}

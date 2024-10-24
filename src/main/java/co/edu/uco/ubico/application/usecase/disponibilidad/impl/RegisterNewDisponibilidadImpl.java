package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidad;
import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadRulesValidator;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

@Component
public class RegisterNewDisponibilidadImpl implements RegisterNewDisponibilidad {

    private final RegisterNewDisponibilidadRulesValidator rulesValidator;

    public RegisterNewDisponibilidadImpl(RegisterNewDisponibilidadRulesValidator rulesValidator) {
        this.rulesValidator = rulesValidator;
    }

    @Override
    public void execute(DisponibilidadDomain disponibilidad) {
        // Validar las reglas antes de proceder con el registro
        rulesValidator.validate(disponibilidad);

        // Aquí se añadiría la lógica para registrar la disponibilidad, por ejemplo, persistirla en la base de datos
    }
}

package co.edu.uco.ubico.application.usecase.disponibilidad.impl;

import co.edu.uco.ubico.application.usecase.disponibilidad.RegisterNewDisponibilidadRulesValidator;
import co.edu.uco.ubico.domain.DomainRule;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisterNewDisponibilidadRulesValidatorImpl implements RegisterNewDisponibilidadRulesValidator {

    private final List<DomainRule<DisponibilidadDomain>> rules;

    public RegisterNewDisponibilidadRulesValidatorImpl(List<DomainRule<DisponibilidadDomain>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(DisponibilidadDomain disponibilidad) {
        for (DomainRule<DisponibilidadDomain> rule : rules) {
            rule.validate(disponibilidad);
        }
    }
}
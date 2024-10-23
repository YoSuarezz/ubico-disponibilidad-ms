package co.edu.uco.ubico.domain.disponibilidad.rules;

import co.edu.uco.ubico.domain.DomainRule;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;


public interface DisponibilidadAulaDoesExistRule extends DomainRule<DisponibilidadDomain> {
    static final String MESSAGE_KEY = "error.disponibilidad.aulaNotNull";


}


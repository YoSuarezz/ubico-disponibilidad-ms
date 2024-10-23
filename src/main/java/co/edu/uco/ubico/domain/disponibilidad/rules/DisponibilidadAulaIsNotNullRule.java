package co.edu.uco.ubico.domain.disponibilidad.rules;

import co.edu.uco.ubico.domain.DomainRule;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;


public interface DisponibilidadAulaIsNotNullRule  extends DomainRule<DisponibilidadDomain> {
    void validate(DisponibilidadDomain data);
}

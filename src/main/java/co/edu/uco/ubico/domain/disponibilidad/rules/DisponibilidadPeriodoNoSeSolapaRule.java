package co.edu.uco.ubico.domain.disponibilidad.rules;

import co.edu.uco.ubico.domain.DomainRule;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;

// Asegurar que el período de disponibilidad no se solape con otro período de disponibilidad para el mismo Aula.
public interface DisponibilidadPeriodoNoSeSolapaRule extends DomainRule<DisponibilidadDomain> {
}

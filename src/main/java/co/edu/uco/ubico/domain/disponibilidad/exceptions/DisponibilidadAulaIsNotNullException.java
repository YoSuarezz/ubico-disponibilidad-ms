package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadAulaIsNotNullException extends RuleUbicoException {
    public DisponibilidadAulaIsNotNullException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }
}

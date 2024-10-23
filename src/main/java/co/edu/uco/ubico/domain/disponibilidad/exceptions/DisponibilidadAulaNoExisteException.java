package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadAulaNoExisteException extends RuleUbicoException {

    private static final long serialVersionUTD = 1L;

    public DisponibilidadAulaNoExisteException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

}

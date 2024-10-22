package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.Layer;
import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadAulaDoesExistException extends RuleUbicoException {
    public DisponibilidadAulaDoesExistException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    private static final long serialVersionUTD = 1L;

}

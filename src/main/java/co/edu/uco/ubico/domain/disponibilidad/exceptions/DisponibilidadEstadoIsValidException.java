package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadEstadoIsValidException extends RuleUbicoException {
    private static final long serialVersionUID = 1L;
    public DisponibilidadEstadoIsValidException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }
}

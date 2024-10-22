package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadDuracionMaximaException extends RuleUbicoException {
    public DisponibilidadDuracionMaximaException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }
}

package co.edu.uco.ubico.domain.disponibilidad.exceptions;

import co.edu.uco.ubico.crosscutting.enums.RuleUbicoException;

public class DisponibilidadAulaMustBeActivaException extends RuleUbicoException {
    public DisponibilidadAulaMustBeActivaException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }
}

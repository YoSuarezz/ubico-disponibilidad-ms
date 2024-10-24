package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadFechaFinIsNotNullException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadFechaFinIsNotNullRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadFechaFinIsNotNullImpl  implements DisponibilidadFechaFinIsNotNullRule {
    private static final String MESSAGE_KEY = "disponibilidad.fecha.fin.notnull";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadFechaFinIsNotNullImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        if (data.getFechaFin() == null) {
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadFechaFinIsNotNullException(
                    message,
                    "La fecha de fin de la disponibilidad no puede ser nula.",
                    new Exception()
            );
        }
    }

}

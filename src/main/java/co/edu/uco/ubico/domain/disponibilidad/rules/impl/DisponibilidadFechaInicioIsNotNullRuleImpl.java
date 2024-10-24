package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadFechaInicioIsNotNullException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadFechaInicioIsNotNullRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadFechaInicioIsNotNullRuleImpl implements DisponibilidadFechaInicioIsNotNullRule {

    private static final String MESSAGE_KEY = "disponibilidad.fecha.inicio.notnull";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadFechaInicioIsNotNullRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        if (data.getFechaInicio() == null) {
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadFechaInicioIsNotNullException(
                    message,
                    "La fecha de inicio de la disponibilidad no puede ser nula.",
                    new Exception()
            );
        }
    }
}

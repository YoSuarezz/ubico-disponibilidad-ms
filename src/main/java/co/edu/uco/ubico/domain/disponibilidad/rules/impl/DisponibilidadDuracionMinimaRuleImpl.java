package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadDuracionMinimaException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadDuracionMinimaRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadDuracionMinimaRuleImpl implements DisponibilidadDuracionMinimaRule {

    private static final String MESSAGE_KEY = "disponibilidad.duracion.minima";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadDuracionMinimaRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        long duracionMinutos = java.time.Duration.between(data.getFechaInicio(), data.getFechaFin()).toMinutes();
        if (duracionMinutos < 60) { // Asumimos que la duración mínima es 30 minutos
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadDuracionMinimaException(
                    message,
                    "La duración de la disponibilidad es menor al mínimo permitido.",
                    new Exception()
            );
        }
    }
}
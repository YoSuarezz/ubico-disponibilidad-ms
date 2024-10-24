package co.edu.uco.ubico.domain.disponibilidad.rules.impl;


import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadDuracionMaximaException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadDuracionMaximaRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadDuracionMaximaRuleImpl implements DisponibilidadDuracionMaximaRule {

    private static final String MESSAGE_KEY = "disponibilidad.duracion.maxima";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadDuracionMaximaRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        // Lógica para verificar la duración
        long duracionHoras = java.time.Duration.between(data.getFechaInicio(), data.getFechaFin()).toHours();
        if (duracionHoras > 2) { // Asumimos que la duración máxima de  una reserva debe ser de una 2 horas
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadDuracionMaximaException(
                    message,
                    "La duración de la disponibilidad excede el máximo permitido.",
                    new Exception()
            );
        }
    }
}

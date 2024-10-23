package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadAulaIsNotNullException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadAulaIsNotNullRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadAulaIsNotNullRuleImpl implements DisponibilidadAulaIsNotNullRule {

    private static final String MESSAGE_KEY = "disponibilidad.aula.notnull";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadAulaIsNotNullRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        if (data.getAula() == null) {
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadAulaIsNotNullException(
                    message,
                    "El objeto Aula en DisponibilidadDomain es nulo.",
                    new Exception()
            );
        }
    }
}

package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadAulaNoExisteException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadAulaNoExisteRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadAulaNoExisteRuleImpl implements DisponibilidadAulaNoExisteRule {

    private static final String MESSAGE_KEY = "disponibilidad.aula.noexiste";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadAulaNoExisteRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {
        if (data.getAula() == null) {
            String message = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadAulaNoExisteException(
                    message,
                    "El aula no existe en el sistema.",
                    new Exception()
            );
        }
    }
}
package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.enums.AulaEstado;
import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadAulaMustBeActivaException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadAulaMustBeActivaRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadAulaMustBeActivaRuleImpl implements DisponibilidadAulaMustBeActivaRule {

    private static final String MESSAGE_KEY = "disponibilidad.aula.mustbeactiva";

    private final MessageProvider messageProvider;

    @Autowired
    public DisponibilidadAulaMustBeActivaRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void validate(DisponibilidadDomain data) {

        if (data.getAula().getEstado() != AulaEstado.ACTIVA) {
            String userMessage = messageProvider.getMessage(MESSAGE_KEY);
            throw new DisponibilidadAulaMustBeActivaException(userMessage, userMessage, null);
        }
    }


}
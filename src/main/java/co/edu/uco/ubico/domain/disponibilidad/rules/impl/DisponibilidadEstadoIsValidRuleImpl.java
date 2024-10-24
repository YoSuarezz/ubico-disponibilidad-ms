package co.edu.uco.ubico.domain.disponibilidad.rules.impl;

import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import co.edu.uco.ubico.domain.disponibilidad.DisponibilidadDomain;
import co.edu.uco.ubico.domain.disponibilidad.exceptions.DisponibilidadEstadoIsValidException;
import co.edu.uco.ubico.domain.disponibilidad.rules.DisponibilidadEstadoIsValidRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadEstadoIsValidRuleImpl implements DisponibilidadEstadoIsValidRule {

    private static final String MESSAGE_KEY = "disponibilidad.estado.invalido";

    private final MessageProvider messageProvider;


    @Autowired
    public DisponibilidadEstadoIsValidRuleImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }


    @Override
    public void validate(DisponibilidadDomain data) {
        //Todo: Implementar la lógica de la regla
    }
}

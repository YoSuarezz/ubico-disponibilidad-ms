package co.edu.uco.ubico.domain.MotivoNoDisponibilidad;

import co.edu.uco.ubico.crosscutting.helpers.TextHelper;

public class MotivoNoDisponibilidadDomain {
    private int id;
    private String motivo;

    private MotivoNoDisponibilidadDomain(final int id,final String motivo) {
        setId(id);
        setMotivo(motivo);
    }
    public static final MotivoNoDisponibilidadDomain crear(int id,final String motivo) {

        return new MotivoNoDisponibilidadDomain(id, motivo);
    }

    public static final MotivoNoDisponibilidadDomain crear() {

        return new MotivoNoDisponibilidadDomain();
    }

    private MotivoNoDisponibilidadDomain() {
        setMotivo(TextHelper.EMPTY);
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getMotivo() {
        return motivo;
    }

    private void setMotivo(String motivo) {
        this.motivo = TextHelper.applyTrim(motivo);
    }
}

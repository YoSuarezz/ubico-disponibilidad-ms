package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class TipoAulaDTO {

    private UUID id;
    private String descripcion;

    public TipoAulaDTO() {
        setId(UUIDHelper.getDefault());
        setDescripcion(TextHelper.EMPTY);
    }

    public static final TipoAulaDTO create() {
        return new TipoAulaDTO();
    }

    public static final TipoAulaDTO create(final UUID id, final String descripcion) {
        return new TipoAulaDTO(id, descripcion);
    }

    public TipoAulaDTO(final UUID id, final String descripcion) {
        setId(id);
        setDescripcion(descripcion);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = TextHelper.applyTrim(descripcion);
    }
}


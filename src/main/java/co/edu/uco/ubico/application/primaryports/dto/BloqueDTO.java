package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class BloqueDTO {

    private UUID id;
    private String nombre;

    public BloqueDTO() {
        setId(UUIDHelper.getDefault());
        setNombre(TextHelper.EMPTY);
    }

    public static final BloqueDTO create() {
        return new BloqueDTO();
    }

    public static final BloqueDTO create(final UUID id, final String nombre) {
        return new BloqueDTO(id, nombre);
    }

    public BloqueDTO(final UUID id, final String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }
}


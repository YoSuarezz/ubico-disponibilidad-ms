package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class AulaDTO {

    private UUID id;
    private String nombre;
    private String tipoAula;

    public AulaDTO() {
        setId(UUIDHelper.getDefault());
        setNombre(TextHelper.EMPTY);
        setTipoAula(TextHelper.EMPTY);
    }

    public AulaDTO(final UUID id, final String nombre, final String tipoAula) {
        setId(id);
        setNombre(nombre);
        setTipoAula(tipoAula);
    }

    public static final AulaDTO create(final UUID id, final String nombre, final String tipoAula) {
        return new AulaDTO(id, nombre, tipoAula);
    }

    public static final AulaDTO create() {
        return new AulaDTO();
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

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(final String tipoAula) {
        this.tipoAula = TextHelper.applyTrim(tipoAula);
    }
}


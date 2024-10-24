package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class AulaDTO {

    private UUID id;
    private String nombre;
    private TipoAulaDTO tipoAula;
    private boolean activa;

    public AulaDTO() {
        setId(UUIDHelper.getDefault());
        setNombre(TextHelper.EMPTY);
        setTipoAula(TipoAulaDTO.create());
        setActiva(false);
    }

    public static final AulaDTO create() {
        return new AulaDTO();
    }

    public static final AulaDTO create(final UUID id, final String nombre, final TipoAulaDTO tipoAula, final boolean activa) {
        return new AulaDTO(id, nombre, tipoAula, activa);
    }

    public AulaDTO(final UUID id, final String nombre, final TipoAulaDTO tipoAula, final boolean activa) {
        setId(id);
        setNombre(nombre);
        setTipoAula(tipoAula);
        setActiva(activa);
    }

    public static final AulaDTO create(final UUID id) {
        return new AulaDTO(id, TextHelper.EMPTY, TipoAulaDTO.create(), false);
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

    public TipoAulaDTO getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(final TipoAulaDTO tipoAula) {
        this.tipoAula = ObjectHelper.getDefault(tipoAula, TipoAulaDTO.create());
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(final boolean activa) {
        this.activa = activa;
    }
}

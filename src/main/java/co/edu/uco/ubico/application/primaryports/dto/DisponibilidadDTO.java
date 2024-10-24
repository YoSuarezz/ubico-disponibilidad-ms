package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.time.LocalDateTime;
import java.util.UUID;

public final class DisponibilidadDTO {

    private UUID id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private AulaDTO aula;
    private String estado;

    public DisponibilidadDTO() {
        setId(UUIDHelper.getDefault());
        setFechaInicio(LocalDateTime.now());
        setFechaFin(LocalDateTime.now().plusHours(1));
        setAula(AulaDTO.create());
        setEstado(TextHelper.EMPTY);
    }

    public static final DisponibilidadDTO create() {
        return new DisponibilidadDTO();
    }

    public static final DisponibilidadDTO create(final UUID id, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final AulaDTO aula, final String estado) {
        return new DisponibilidadDTO(id, fechaInicio, fechaFin, aula, estado);
    }

    public DisponibilidadDTO(final UUID id, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final AulaDTO aula, final String estado) {
        setId(id);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setAula(aula);
        setEstado(estado);
    }

    public static final DisponibilidadDTO create(final UUID id) {
        return new DisponibilidadDTO(id, LocalDateTime.now(), LocalDateTime.now().plusHours(1), AulaDTO.create(), TextHelper.EMPTY);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault();
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(final LocalDateTime fechaInicio) {
        this.fechaInicio = ObjectHelper.getDefault(fechaInicio, LocalDateTime.now());
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(final LocalDateTime fechaFin) {
        this.fechaFin = ObjectHelper.getDefault(fechaFin, LocalDateTime.now().plusHours(1));
    }

    public AulaDTO getAula() {
        return aula;
    }

    public void setAula(final AulaDTO aula) {
        this.aula = ObjectHelper.getDefault(aula, AulaDTO.create());
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(final String estado) {
        this.estado = TextHelper.applyTrim(estado);
    }
}

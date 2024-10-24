package co.edu.uco.ubico.application.primaryports.dto;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.time.LocalDateTime;
import java.util.UUID;

public class RegisterNewDisponibilidadDTO {

    private UUID aulaId;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado;

    public RegisterNewDisponibilidadDTO(final UUID aulaId, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final String estado) {
        setAulaId(aulaId);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setEstado(estado);
    }

    public static RegisterNewDisponibilidadDTO create(final UUID aulaId, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final String estado) {
        return new RegisterNewDisponibilidadDTO(aulaId, fechaInicio, fechaFin, estado);
    }

    public UUID getAulaId() {
        return aulaId;
    }

    private void setAulaId(UUID aulaId) {
        this.aulaId = ObjectHelper.getDefault(aulaId, UUIDHelper.getDefault());
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    private void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = ObjectHelper.getDefault(fechaInicio, LocalDateTime.now());
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    private void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = ObjectHelper.getDefault(fechaFin, LocalDateTime.now().plusHours(1));
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = TextHelper.applyTrim(estado);
    }
}
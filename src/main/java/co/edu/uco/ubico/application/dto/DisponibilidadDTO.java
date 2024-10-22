package co.edu.uco.ubico.application.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class DisponibilidadDTO {
    private UUID id;
    private UUID aulaId;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAulaId() {
        return aulaId;
    }

    public void setAulaId(UUID aulaId) {
        this.aulaId = aulaId;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

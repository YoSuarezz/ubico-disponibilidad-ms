package co.edu.uco.ubico.domain.disponibilidad;

import co.edu.uco.ubico.crosscutting.helpers.TimeHelper;
import co.edu.uco.ubico.domain.Domain;
import co.edu.uco.ubico.domain.aula.AulaDomain;

import java.time.LocalDateTime;
import java.util.UUID;

public  final class DisponibilidadDomain extends Domain {

    private AulaDomain aula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private boolean disponible;

    public DisponibilidadDomain(UUID id) {
        super(id);
        this.aula = null;
        this.fechaInicio = TimeHelper.getDefaultDateTime();
        this.fechaFin = TimeHelper.getDefaultDateTime();
        this.disponible = false;
    }

    public AulaDomain getAula() {
        return aula;
    }

    public void setAula(AulaDomain aula) {
        this.aula = aula;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
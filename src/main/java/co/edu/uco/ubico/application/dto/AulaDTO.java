package co.edu.uco.ubico.application.dto;

import java.util.UUID;

public class AulaDTO {
    private UUID id;
    private String name;
    private UUID bloqueId;
    private UUID tipoAulaId;
    private int capacidad;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getBloqueId() {
        return bloqueId;
    }

    public void setBloqueId(UUID bloqueId) {
        this.bloqueId = bloqueId;
    }

    public UUID getTipoAulaId() {
        return tipoAulaId;
    }

    public void setTipoAulaId(UUID tipoAulaId) {
        this.tipoAulaId = tipoAulaId;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

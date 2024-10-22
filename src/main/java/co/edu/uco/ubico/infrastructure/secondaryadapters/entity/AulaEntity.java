package co.edu.uco.ubico.infrastructure.secondaryadapters.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "aula")
public class AulaEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "bloque_id")
    private BloqueEntity bloque;

    @ManyToOne
    @JoinColumn(name = "tipo_aula_id")
    private TipoAulaEntity tipoAula;

    @Column(name = "capacidad")
    private int capacidad;

    // Getters y Setters
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

    public BloqueEntity getBloque() {
        return bloque;
    }

    public void setBloque(BloqueEntity bloque) {
        this.bloque = bloque;
    }

    public TipoAulaEntity getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(TipoAulaEntity tipoAula) {
        this.tipoAula = tipoAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

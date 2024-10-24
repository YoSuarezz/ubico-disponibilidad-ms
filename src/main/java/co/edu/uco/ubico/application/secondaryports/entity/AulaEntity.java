package co.edu.uco.ubico.application.secondaryports.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "aula")
public class AulaEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "tipo_aula_id")
    private TipoAulaEntity tipoAula;

    @Column(name = "activa")
    private boolean activa;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAulaEntity getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(TipoAulaEntity tipoAula) {
        this.tipoAula = tipoAula;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
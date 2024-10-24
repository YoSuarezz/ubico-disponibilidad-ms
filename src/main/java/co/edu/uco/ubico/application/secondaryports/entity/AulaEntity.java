package co.edu.uco.ubico.application.secondaryports.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "aulas")
public class AulaEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String tipoAula;

    @Column(nullable = false)
    private boolean activa;

    // Constructores, getters y setters

    public AulaEntity() {
        // Constructor por defecto
    }

    public AulaEntity(UUID id, String nombre, String tipoAula, boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.tipoAula = tipoAula;
        this.activa = activa;
    }

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

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}

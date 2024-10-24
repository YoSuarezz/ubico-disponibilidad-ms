package co.edu.uco.ubico.domain.aula;

import co.edu.uco.ubico.crosscutting.enums.AulaEstado;
import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.domain.Domain;
import co.edu.uco.ubico.domain.bloque.BloqueDomain;
import co.edu.uco.ubico.domain.tipoaula.TipoAulaDomain;

import co.edu.uco.ubico.domain.tipoaula.TipoAulaDomain;

import java.util.UUID;

public final class AulaDomain extends Domain {

    private String name;
    private BloqueDomain bloque;
    private TipoAulaDomain tipoDeAula;
    private int capacidad;
    private AulaEstado estado;

    public AulaDomain(UUID id) {
        super(id);
        setName(name);
        this.estado = AulaEstado.ACTIVA;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public BloqueDomain getBloque() {
        return bloque;
    }

    public void setBloque(BloqueDomain bloque) {
        this.bloque = bloque;
    }

    public TipoAulaDomain getTipoDeAula() {
        return tipoDeAula;
    }

    public void setTipoDeAula(TipoAulaDomain tipoDeAula) {
        this.tipoDeAula = tipoDeAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public AulaEstado getEstado() {
        return estado;
    }

    public void setEstado(AulaEstado estado) {
        this.estado = estado;
    }
}
package co.edu.uco.ubico.domain.bloque;

import co.edu.uco.ubico.domain.Domain;

import java.util.UUID;

public final class BloqueDomain extends Domain {
    private String name;


    public BloqueDomain(UUID id) {
        super(id);
        setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
}
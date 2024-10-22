package co.edu.uco.ubico.domain.tipoaula;

import co.edu.uco.ubico.domain.Domain;

import java.util.UUID;

public class TipoAulaDomain extends Domain {
    private String name;

    public TipoAulaDomain(final UUID id) {
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

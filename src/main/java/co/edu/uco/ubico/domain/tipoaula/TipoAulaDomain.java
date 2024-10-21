package co.edu.uco.ubico.domain.tipoaula;

import co.edu.uco.ubico.crosscutting.helpers.TextHelper;

public class TipoAulaDomain {
    private String name;

    public TipoAulaDomain(String name) {
        setName(name);
    }


    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
}

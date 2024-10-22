package co.edu.uco.ubico.domain;


import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class Domain {

    private UUID id;

    protected Domain(final UUID id) {
        setId(id);
    }

    public final UUID getId() {
        return id;
    }

    private final void setId(UUID id) {
        this.id = id;
    }

    public void generateId() {
        this.id = UUIDHelper.generate();
    }
}

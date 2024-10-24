package co.edu.uco.ubico.crosscutting.enums;

public enum DisponibilidadEstado {
    DISPONIBLE,
    NO_DISPONIBLE,
    RESERVADA,
    EN_MANTENIMIENTO;

    public boolean esValido() {
        return this == DISPONIBLE || this == NO_DISPONIBLE || this == RESERVADA || this == EN_MANTENIMIENTO;
    }
}

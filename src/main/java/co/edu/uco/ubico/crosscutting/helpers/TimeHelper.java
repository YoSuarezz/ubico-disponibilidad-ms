package co.edu.uco.ubico.crosscutting.helpers;

import java.time.LocalDateTime;

public final class TimeHelper {

    private TimeHelper() {
        // Constructor privado para evitar la creación de instancias
    }

    public static LocalDateTime getDefaultDateTime() {
        return LocalDateTime.of(1970, 1, 1, 0, 0); // Valor predeterminado: inicio del epoch
    }

    public static boolean isBefore(LocalDateTime first, LocalDateTime second) {
        return first != null && second != null && first.isBefore(second);
    }
}

package co.edu.uco.ubico.infrastructure.primaryadapters.controller.rest.disponibilidad;

import co.edu.uco.ubico.application.primaryports.dto.DisponibilidadDTO;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/disponibilidad")
public class RegisterNewDisponibilidadController {
    @GetMapping("/dummy")
    public DisponibilidadDTO executedummy() {
        // Crear un DTO de prueba con datos simulados
        DisponibilidadDTO dummyDisponibilidad = new DisponibilidadDTO();
        dummyDisponibilidad.setId(UUIDHelper.generate());
        dummyDisponibilidad.setFechaInicio(LocalDateTime.now());
        dummyDisponibilidad.setFechaFin(LocalDateTime.now().plusHours(2));
        dummyDisponibilidad.setEstado("Disponible");

        // Devolver el DTO de prueba
        return dummyDisponibilidad;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is up and running");
    }
}
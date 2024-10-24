package co.edu.uco.ubico.infrastructure.primaryadapters.controller.rest.disponibilidad;
import co.edu.uco.ubico.application.primaryports.dto.RegisterNewDisponibilidadDTO;
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
    public RegisterNewDisponibilidadDTO executedummy() {
        // Crear un DTO de prueba con datos simulados
        RegisterNewDisponibilidadDTO dummyDisponibilidad = new RegisterNewDisponibilidadDTO(
                UUIDHelper.generate(),
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                "Disponible"
        );

        // Devolver el DTO de prueba
        return dummyDisponibilidad;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is up and running");
    }
}
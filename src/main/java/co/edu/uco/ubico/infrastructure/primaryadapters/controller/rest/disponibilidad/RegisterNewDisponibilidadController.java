package co.edu.uco.ubico.infrastructure.primaryadapters.controller.rest.disponibilidad;

import co.edu.uco.ubico.application.primaryports.dto.DisponibilidadDTO;
import co.edu.uco.ubico.application.primaryports.interactor.disponibilidad.RegisterNewDisponibilidadInteractor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disponibilidad")
public class RegisterNewDisponibilidadController {

    private final RegisterNewDisponibilidadInteractor registerNewDisponibilidadInteractor;

    public RegisterNewDisponibilidadController(RegisterNewDisponibilidadInteractor registerNewDisponibilidadInteractor) {
        this.registerNewDisponibilidadInteractor = registerNewDisponibilidadInteractor;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerDisponibilidad(@RequestBody DisponibilidadDTO disponibilidadDTO) {
        try {
            // Ejecutar el interactor para registrar la disponibilidad
            registerNewDisponibilidadInteractor.execute(disponibilidadDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            // Manejo de errores
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
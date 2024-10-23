package co.edu.uco.ubico.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
public class UbicoDisponibilidadMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbicoDisponibilidadMsApplication.class, args);
    }

}

package co.edu.uco.ubico.application.secondaryports.repository;

import co.edu.uco.ubico.application.secondaryports.entity.TipoAulaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoAulaRepository extends JpaRepository<TipoAulaEntity, UUID> {
}
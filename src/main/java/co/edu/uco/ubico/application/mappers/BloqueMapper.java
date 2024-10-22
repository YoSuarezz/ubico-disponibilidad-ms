package co.edu.uco.ubico.application.mappers;

import co.edu.uco.ubico.application.dto.BloqueDTO;
import co.edu.uco.ubico.domain.bloque.BloqueDomain;

public class BloqueMapper {

    private BloqueMapper() {}

        public static BloqueDTO toDTO(BloqueDomain domain) {
            if (domain == null) {
                return null;
            }

            BloqueDTO dto = new BloqueDTO();
            dto.setId(domain.getId());
            dto.setName(domain.getName());
            return dto;
        }

        public static BloqueDomain toDomain(BloqueDTO dto) {
            if (dto == null) {
                return null;
            }

            BloqueDomain domain = new BloqueDomain(dto.getId());
            domain.setName(dto.getName());
            return domain;
        }
    }


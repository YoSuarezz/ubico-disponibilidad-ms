package co.edu.uco.ubico.application.secondaryports.data.sql.repository;

import co.edu.uco.ubico.application.secondaryports.entity.DisponibilidadEntity;
import co.edu.uco.ubico.application.secondaryports.repository.DisponibilidadRepositoryCustom;
import co.edu.uco.ubico.crosscutting.enums.RepositoryUbicoException;
import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class DisponibilidadRepositoryCustomImpl implements DisponibilidadRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public DisponibilidadRepositoryCustomImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<DisponibilidadEntity> findByFilter(final DisponibilidadEntity filter) {
        try {
            var criteriaBuilder = entityManager.getCriteriaBuilder();
            var query = criteriaBuilder.createQuery(DisponibilidadEntity.class);
            var root = query.from(DisponibilidadEntity.class);

            var predicates = new ArrayList<Predicate>();

            if (!ObjectHelper.isNull(filter)) {

                if (!UUIDHelper.isDefault(filter.getId())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("id"), filter.getId()));
                }
                if (!ObjectHelper.isNull(filter.getFechaInicio())) {
                    predicates.add((Predicate) criteriaBuilder.greaterThanOrEqualTo(root.get("fechaInicio"), filter.getFechaInicio()));
                }
                if (!ObjectHelper.isNull(filter.getFechaFin())) {
                    predicates.add((Predicate) criteriaBuilder.lessThanOrEqualTo(root.get("fechaFin"), filter.getFechaFin()));
                }
                if (!TextHelper.isEmpty(filter.getEstado())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("estado"), filter.getEstado()));
                }
                if (!ObjectHelper.isNull(filter.getAula()) && !UUIDHelper.isDefault(filter.getAula().getId())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("aula"), filter.getAula()));
                }
            }

            query.select(root).where(criteriaBuilder.and(predicates.toArray(new jakarta.persistence.criteria.Predicate[0])));
            return entityManager.createQuery(query).getResultList();
        } catch (final Exception exception) {
            throw RepositoryUbicoException.create(null, null, exception);
        }
    }
}
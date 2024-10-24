package co.edu.uco.ubico.application.secondaryports.data.sql.repository;

import co.edu.uco.ubico.application.secondaryports.entity.AulaEntity;
import co.edu.uco.ubico.application.secondaryports.repository.AulaRepositoryCustom;
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
public class AulaRepositoryCustomImpl implements AulaRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public AulaRepositoryCustomImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<AulaEntity> findByFilter(final AulaEntity filter) {
        try {
            var criteriaBuilder = entityManager.getCriteriaBuilder();
            var query = criteriaBuilder.createQuery(AulaEntity.class);
            var root = query.from(AulaEntity.class);

            var predicates = new ArrayList<Predicate>();

            if (!ObjectHelper.isNull(filter)) {

                if (!UUIDHelper.isDefault(filter.getId())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("id"), filter.getId()));
                }
                if (!TextHelper.isEmpty(filter.getNombre())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("nombre"), filter.getNombre()));
                }
                if (!TextHelper.isEmpty(filter.getTipoAula())) {
                    predicates.add((Predicate) criteriaBuilder.equal(root.get("tipoAula"), filter.getTipoAula()));
                }
                predicates.add((Predicate) criteriaBuilder.equal(root.get("activa"), filter.isActiva()));
            }

            query.select(root).where(criteriaBuilder.and(predicates.toArray(new jakarta.persistence.criteria.Predicate[0])));
            return entityManager.createQuery(query).getResultList();
        } catch (final Exception exception) {
            throw RepositoryUbicoException.create(null, null, exception);
        }
    }
}

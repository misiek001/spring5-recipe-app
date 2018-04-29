package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<guru.springframework.domain.UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}

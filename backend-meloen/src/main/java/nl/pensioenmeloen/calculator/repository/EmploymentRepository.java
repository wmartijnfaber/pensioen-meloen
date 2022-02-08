package nl.pensioenmeloen.calculator.repository;

import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface EmploymentRepository extends ReactiveCrudRepository<EmploymentEntity, Long> {

    Mono<EmploymentEntity> findEmploymentEntityById(Long id);
}

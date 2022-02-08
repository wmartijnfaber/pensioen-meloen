package nl.pensioenmeloen.calculator.repository;

import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmploymentRepository extends ReactiveCrudRepository<EmploymentEntity, Long> {

}

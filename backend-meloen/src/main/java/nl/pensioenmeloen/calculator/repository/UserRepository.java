package nl.pensioenmeloen.calculator.repository;

import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {

}


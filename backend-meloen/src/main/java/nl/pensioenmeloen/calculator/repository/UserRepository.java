package nl.pensioenmeloen.calculator.repository;

import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {

}


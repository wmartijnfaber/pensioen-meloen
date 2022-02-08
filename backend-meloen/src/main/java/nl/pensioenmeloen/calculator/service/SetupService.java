package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.repository.EmploymentRepository;
import nl.pensioenmeloen.calculator.repository.UserRepository;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class SetupService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmploymentRepository employmentRepository;

    public void setup() {
        EmploymentEntity employmentEntity = new EmploymentEntity();
        UserEntity userEntity = new UserEntity();
        userEntity.setCity("Leusden");
        userEntity.setDateOfBirth(LocalDateTime.now());
        userEntity.setEmail("martijn@viteon.nl");
        userEntity.setFirstname("Martijn");
        userEntity.setLastname("Faber");
        userEntity.setPreferredRetireAge(67);
        userEntity.setHousenumber(4);
        userEntity.setStreet("Platanenlaan 4");

        employmentEntity.setEmploymentType("Vast dienstverband");
        employmentEntity.setEmployerName("beFrank");
        employmentEntity.setSalary(5000);
        employmentEntity.setCurrentValue(100000.00);
        employmentEntity.setDepositBankAccount("NLABNA123456789");

        employmentRepository.save(employmentEntity);
        userRepository.save(userEntity);

        // EmploymentEntity e = employmentRepository.findEmploymentEntityById(1L).block();
        System.out.println("Setup complete");

    }

}

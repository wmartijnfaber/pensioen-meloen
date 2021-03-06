package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.repository.EmploymentRepository;
import nl.pensioenmeloen.calculator.repository.UserRepository;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class SetupService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmploymentRepository employmentRepository;

    public void setup() {
        UserEntity userEntity = UserEntity.builder()
        .city("Leusden")
        .email("martijn@viteon.nl")
        .firstname("Martijn")
        .lastname("Faber")
        .preferredRetireAge(67)
        .housenumber(4)
        .street("Platanenlaan 4")
        .dateOfBirth(LocalDate.of(1990, 2, 25))
        .zip("3833AX")
        .build();

        EmploymentEntity employmentEntity = EmploymentEntity.builder()
        .employmentType("Vast dienstverband")
        .employerName("beFrank")
        .salary(BigDecimal.valueOf(5000))
        .currentValue(BigDecimal.valueOf(100000.00))
        .depositBankAccount("NLABNA123456789")
        .parttimePercentage(BigDecimal.valueOf(.8))
        .build();

        employmentRepository.save(employmentEntity).subscribe();
        userRepository.save(userEntity).subscribe();
    }

}

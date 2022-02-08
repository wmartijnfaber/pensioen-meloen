package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.dto.Employment;
import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.dto.User;
import nl.pensioenmeloen.calculator.repository.EmploymentRepository;
import nl.pensioenmeloen.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
public class SetupService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmploymentRepository employmentRepository;

    @PostConstruct
    private void setup() {
        User user = User.builder()
                .city("Leusden")
                .dateOfBirth(LocalDateTime.now())
                .email("martijn@viteon.nl")
                .firstname("Martijn")
                .lastname("Faber")
                .preferredRetireAge(67)
                .housenumber(4)
                .street("Platanenlaan 4")
                .build();

        Employment employment = Employment.builder()
                .employmentType("Vast dienstverband")
                .employerName("beFrank")
                .salary(5000)
                .depositBankAccount("NLABNA123456789")
                .build();

        Pension.builder().employment(employment).user(user).build();

    }

}

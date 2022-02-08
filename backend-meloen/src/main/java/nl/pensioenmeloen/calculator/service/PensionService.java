package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.model.Employment;
import nl.pensioenmeloen.calculator.model.Pension;
import nl.pensioenmeloen.calculator.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PensionService {

    public Pension getDummy() {
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

        return Pension.builder().employment(employment).user(user).build();
    }

}

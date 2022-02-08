package nl.pensioenmeloen.calculator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class User {
    private String firstname;
    private String lastname;
    private String email;
    private LocalDateTime dateOfBirth;
    private String street;
    private String city;
    private String zip;
    private Integer housenumber;
    private String housenumberAddition;
    private Integer preferredRetireAge;
}

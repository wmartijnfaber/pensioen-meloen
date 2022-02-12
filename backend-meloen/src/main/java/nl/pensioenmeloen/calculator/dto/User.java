package nl.pensioenmeloen.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public Long id;
    public String firstname;
    public String lastname;
    public String email;
    public LocalDate dateOfBirth;
    public String street;
    public String city;
    public String zip;
    public Integer housenumber;
    public String housenumberAddition;
    public Integer preferredRetireAge;
}

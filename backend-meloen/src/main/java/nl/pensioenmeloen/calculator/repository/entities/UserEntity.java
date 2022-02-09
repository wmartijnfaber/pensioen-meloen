package nl.pensioenmeloen.calculator.repository.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;



@Table("user")
@Data
@Builder
public class UserEntity {

    @Id
    private Long id;
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

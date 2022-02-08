package nl.pensioenmeloen.calculator.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;


@Table("user")
@Entity
@Data
@NoArgsConstructor
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

package nl.pensioenmeloen.calculator.repository.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import org.springframework.data.annotation.Id;


@Table("employment")
@Data
@Builder
public class EmploymentEntity {

    @Id
    private Long id;
    private String employerName;
    private Integer salary;
    private Double currentValue;
    private String employmentType;
    private String depositBankAccount;
}

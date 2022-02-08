package nl.pensioenmeloen.calculator.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.Entity;
import javax.persistence.Id;


@Table("employment")
@Entity
@Data
@NoArgsConstructor
public class EmploymentEntity {

    @Id
    private Long id;
    private String employerName;
    private Integer salary;
    private Double currentValue;
    private String employmentType;
    private String depositBankAccount;
}

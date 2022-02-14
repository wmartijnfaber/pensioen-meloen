package nl.pensioenmeloen.calculator.repository.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;


@Table("employment")
@Data
@Builder
public class EmploymentEntity {

    @Id
    private Long id;
    private String employerName;
    private BigDecimal salary;
    private BigDecimal currentValue;
    private String employmentType;
    private String depositBankAccount;
    private BigDecimal parttimePercentage;
    private Boolean holidayPay;
    private Integer numberOfAdditionalMonth;
    private BigDecimal yearlyBonus;

    public BigDecimal getYearSalary () {
        if(holidayPay) {
            return (salary.multiply(BigDecimal.valueOf(12)))
                    .add(salary.multiply(BigDecimal.valueOf(numberOfAdditionalMonth)))
                    .multiply(BigDecimal.valueOf(1.08))
                    .add(yearlyBonus);
        }
        return  (salary.multiply(BigDecimal.valueOf(12)))
                .add(salary.multiply(BigDecimal.valueOf(numberOfAdditionalMonth)))
                .add(yearlyBonus);
    }
}

package nl.pensioenmeloen.calculator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employment {
    private String employerName;
    private Integer salary;
    private Double currentValue;
    private String employmentType;
    private String depositBankAccount;
}

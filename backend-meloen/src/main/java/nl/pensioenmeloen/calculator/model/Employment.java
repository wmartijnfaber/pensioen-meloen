package nl.pensioenmeloen.calculator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Employment {
    private String employerName;
    private Integer salary;
    private String employmentType;
    private String depositBankAccount;
}

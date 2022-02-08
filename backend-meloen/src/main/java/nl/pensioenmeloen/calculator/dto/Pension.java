package nl.pensioenmeloen.calculator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pension {
    private Integer calculatedValue;
    private Employment employment;
    private User user;
}

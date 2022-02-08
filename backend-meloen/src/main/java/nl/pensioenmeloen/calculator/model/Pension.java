package nl.pensioenmeloen.calculator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Pension {
    private Employment employment;
    private User user;
}

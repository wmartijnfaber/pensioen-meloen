package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.dto.Pension;
import org.springframework.stereotype.Service;


@Service
public class PensionService {

    public Pension getDummy() {
        return Pension.builder().build();
    }

}

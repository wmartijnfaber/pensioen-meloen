package nl.pensioenmeloen.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}


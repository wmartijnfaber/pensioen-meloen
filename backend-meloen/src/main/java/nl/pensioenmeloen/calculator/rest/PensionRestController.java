package nl.pensioenmeloen.calculator.rest;

import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.service.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pension")
public class PensionRestController {

    @Autowired
    private PensionService pensionService;

    @GetMapping("/get")
    public Mono<Pension> getPensionById() {
        return Mono.just(pensionService.getDummy());
    }
}

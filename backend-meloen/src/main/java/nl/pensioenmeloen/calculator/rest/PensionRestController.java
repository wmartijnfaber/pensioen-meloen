package nl.pensioenmeloen.calculator.rest;

import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.service.PensionService;
import nl.pensioenmeloen.calculator.service.SetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pension")
public class PensionRestController {

    @Autowired
    private PensionService pensionService;

    @Autowired
    private SetupService setupService;

    @GetMapping("/get/{id}")
    public Mono<Pension> getPensionById(@PathVariable Long id) {
        setupService.setup();
        return pensionService.getPensionById(id);
    }
}

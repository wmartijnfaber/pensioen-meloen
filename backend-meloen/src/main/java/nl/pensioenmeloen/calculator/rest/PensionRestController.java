package nl.pensioenmeloen.calculator.rest;

import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.service.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pension")
@CrossOrigin(origins = "http://localhost:4200") // Lelijk, I know, maar kreeg de proxy.conf.json ff niet lekker in de front-end
public class PensionRestController {

    @Autowired
    private PensionService pensionService;

    @GetMapping("/get/{id}")
    public Mono<Pension> getPensionById(@PathVariable Long id) {
        return pensionService.getPensionById(id);
    }
}

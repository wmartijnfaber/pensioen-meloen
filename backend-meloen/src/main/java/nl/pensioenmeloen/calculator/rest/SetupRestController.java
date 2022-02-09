package nl.pensioenmeloen.calculator.rest;

import nl.pensioenmeloen.calculator.service.SetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setup")
public class SetupRestController {

    @Autowired
    private SetupService setupService;

    @GetMapping("/initial")
    public String defaultSetup () {
        setupService.setup();
        return "ok";
    }
}

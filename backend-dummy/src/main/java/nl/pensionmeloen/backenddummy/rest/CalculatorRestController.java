package nl.pensionmeloen.backenddummy.rest;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/calculator")
public class CalculatorRestController {

    @GetMapping("/get/{age}")
    public Integer getCalculatedValue(@PathVariable Integer age) {
        return ThreadLocalRandom.current().nextInt(age*100, age * 105);
    }
}

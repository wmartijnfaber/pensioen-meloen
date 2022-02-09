package nl.pensionmeloen.backenddummy.rest;

import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/calculator")
public class CalculatorRestController {

    private Random random = new Random();

    @GetMapping("/get/{age}")
    public Integer getCalculatedValue(@PathVariable Integer age) {
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ThreadLocalRandom.current().nextInt(age*100, age * 105);
    }
}

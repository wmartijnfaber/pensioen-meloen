package nl.pensionmeloen.backenddummy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("calculator")
public class CalculatorRestController {

    @GetMapping("/get")
    public Integer getCalculatedValue(@RequestParam Integer age) {
        return ThreadLocalRandom.current().nextInt(age*100, age * 105);
    }
}

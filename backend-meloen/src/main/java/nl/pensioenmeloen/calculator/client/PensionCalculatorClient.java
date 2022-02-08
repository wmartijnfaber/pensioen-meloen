package nl.pensioenmeloen.calculator.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PensionCalculatorClient {

    private WebClient client = WebClient.create("http://localhost:8081");


    public Mono<Integer> getCalculation(Integer age) {
        return client.get()
                .uri("/calculator/get/" +age, "1")
                .retrieve()
                .bodyToMono(Integer.class);

    }
}

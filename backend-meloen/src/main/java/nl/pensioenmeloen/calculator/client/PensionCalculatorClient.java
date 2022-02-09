package nl.pensioenmeloen.calculator.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PensionCalculatorClient {

    @Value("${remote.host}")
    private String remoteHost;

    public Mono<Integer> getCalculation(Integer age) {
        WebClient client = WebClient.create(remoteHost);
        return client.get()
                .uri("/calculator/get/" +age)
                .retrieve()
                .bodyToMono(Integer.class);
    }

}

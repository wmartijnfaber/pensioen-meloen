package nl.pensioenmeloen.calculator.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;


@Component
public class PensionCalculatorClient {

    @Value("${remote.host}")
    private String remoteHost;

    Logger logger = LoggerFactory.getLogger(PensionCalculatorClient.class);

    public Mono<Integer> getCalculation(Integer age) {
        WebClient client = WebClient.create(remoteHost);
        return client.get()
                .uri("/calculator/get/" +age)
                .retrieve()
                .bodyToMono(Integer.class)
                .timeout(Duration.ofSeconds(10))
                .doOnError(throwable -> logger.error("Helaas pindakaas, iets gaat niet helemaal lekker bij het ophalen van {}", remoteHost))
                .onErrorReturn(0);
    }

}

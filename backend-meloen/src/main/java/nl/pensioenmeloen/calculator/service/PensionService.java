package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.client.PensionCalculatorClient;
import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.mapper.EmploymentMapper;
import nl.pensioenmeloen.calculator.mapper.PensionMapper;
import nl.pensioenmeloen.calculator.mapper.UserMapper;
import nl.pensioenmeloen.calculator.repository.EmploymentRepository;
import nl.pensioenmeloen.calculator.repository.UserRepository;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class PensionService {

    @Autowired
    private EmploymentRepository employmentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PensionCalculatorClient pensionCalculatorClient;

    public Mono<Pension> getPensionById(Long id) {
        Mono<Integer> monoInteger = pensionCalculatorClient.getCalculation(80);
        Mono<EmploymentEntity> monoEmployment = employmentRepository.findEmploymentEntityById(id);
        Mono<UserEntity> monoUser = userRepository.findUserEntityById(id);

        return Mono.zip(monoInteger, monoUser, monoEmployment).flatMap(response ->{
            return
                Mono.just(PensionMapper.INSTANCE.getPensionDto(response.getT1(),
                        UserMapper.INSTANCE.entityToDto(response.getT2()),
                        EmploymentMapper.INSTANCE.entityToDto(response.getT3())));
        } );

    }

}

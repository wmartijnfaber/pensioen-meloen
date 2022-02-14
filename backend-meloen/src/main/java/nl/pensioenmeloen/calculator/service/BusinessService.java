package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * This is a service for excellent business
 */
@Service
public class BusinessService {

    @Value("${franchise}")
    private Integer franchise;

    @Value("${premie}")
    private Double premie;

    @Value("${rendement}")
    private Double rendement;

    BigDecimal getYearlyDeposit (EmploymentEntity employment) {
        return (employment.getYearSalary().subtract(BigDecimal.valueOf(franchise)))
                .multiply(employment.getParttimePercentage())
                .multiply(BigDecimal.valueOf(premie));

    }

    BigDecimal getValuePensionSimplified (UserEntity user, EmploymentEntity employment) {
        Integer numberOfRemainingWorkingYears = user.getPreferredRetireAge() - user.getCurrentAge();
        BigDecimal futureValue = employment.getCurrentValue();
        BigDecimal yearlyDeposit = getYearlyDeposit(employment);
        for (int i = 1; i <= numberOfRemainingWorkingYears; i++) { // Been a while since my last for loop :-D ahwell, please forgive me for my sins
            futureValue = futureValue.add(yearlyDeposit)
                    .add(
                    futureValue.add((yearlyDeposit.divide(BigDecimal.valueOf(2))))
                            .multiply(BigDecimal.valueOf(rendement)));

        }
        return futureValue;
    }


}

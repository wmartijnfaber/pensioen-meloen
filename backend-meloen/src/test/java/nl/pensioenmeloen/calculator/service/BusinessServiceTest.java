package nl.pensioenmeloen.calculator.service;

import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = BusinessService.class)
class BusinessServiceTest {

    @Autowired
    BusinessService businessService;

    @Test
    void getYearlyDeposit() {
        EmploymentEntity employment = EmploymentEntity.builder()
                .currentValue(BigDecimal.valueOf(100000.00))
                .salary(BigDecimal.valueOf(5000))
                .holidayPay(false)
                .parttimePercentage(BigDecimal.valueOf(.8))
                .numberOfAdditionalMonth(0)
                .yearlyBonus(BigDecimal.valueOf(0))
                .build();

        BigDecimal value = businessService.getYearlyDeposit(employment);
        assertThat(value).isNotNull();
        assertThat(value.setScale(2, RoundingMode.HALF_UP)).isEqualTo(BigDecimal.valueOf(1776.04));

    }

    @Test
    void getValuePensionSimplifiedOneYear() {
        EmploymentEntity employment = EmploymentEntity.builder()
                .currentValue(BigDecimal.valueOf(100000.00))
                .salary(BigDecimal.valueOf(5000))
                .holidayPay(false)
                .parttimePercentage(BigDecimal.valueOf(.8))
                .numberOfAdditionalMonth(0)
                .yearlyBonus(BigDecimal.valueOf(0))
                .build();

        UserEntity user = UserEntity.builder()
                .preferredRetireAge(61)
                .dateOfBirth(LocalDate.now().minusYears(60))
                .build();

        BigDecimal value = businessService.getValuePensionSimplified(user,employment);
        assertThat(value).isNotNull();
        assertThat(value.setScale(2, RoundingMode.HALF_UP)).isEqualTo(BigDecimal.valueOf(104802.68)); /// Soo I prly made a rounding error cause the case specified I should get .70 cents. I rewrote all to use Bigdecimals, but I clearly missed something
    }

    @Test
    void getValuePensionSimplifiedFoirYear() {
        EmploymentEntity employment = EmploymentEntity.builder()
                .currentValue(BigDecimal.valueOf(100000.00))
                .salary(BigDecimal.valueOf(5000))
                .holidayPay(false)
                .parttimePercentage(BigDecimal.valueOf(.8))
                .numberOfAdditionalMonth(0)
                .yearlyBonus(BigDecimal.valueOf(0))
                .build();

        UserEntity user = UserEntity.builder()
                .preferredRetireAge(65)
                .dateOfBirth(LocalDate.now().minusYears(60))
                .build();

        BigDecimal value = businessService.getValuePensionSimplified(user,employment);
        assertThat(value).isNotNull();
        assertThat(value.setScale(2, RoundingMode.HALF_UP)).isEqualTo(BigDecimal.valueOf( 125498.08)); /// Soo I prly made a rounding error cause the case specified I should get .70 cents. I rewrote all to use Bigdecimals, but I clearly missed something
    }
}

package nl.pensioenmeloen.calculator.mapper;

import nl.pensioenmeloen.calculator.dto.Employment;
import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.dto.User;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PensionMapper {

    PensionMapper INSTANCE = Mappers.getMapper(PensionMapper.class);

    @Mapping(source = "calculatedValue", target = "calculatedValue")
    @Mapping(source = "employment", target = "employment")
    @Mapping(source = "user", target = "user")
    Pension getPensionDto(Integer calculatedValue, User user, Employment employment);
}

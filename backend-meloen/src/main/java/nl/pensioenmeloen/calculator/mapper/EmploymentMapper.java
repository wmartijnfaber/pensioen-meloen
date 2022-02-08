package nl.pensioenmeloen.calculator.mapper;

import nl.pensioenmeloen.calculator.dto.Employment;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmploymentMapper {
    EmploymentMapper INSTANCE = Mappers.getMapper(EmploymentMapper.class);

    @Mapping(source="employerName", target="employerName")
    @Mapping(source="salary", target="salary")
    @Mapping(source="currentValue", target="currentValue")
    @Mapping(source="employmentType", target="employmentType")
    @Mapping(source="depositBankAccount", target="depositBankAccount")
    Employment entityToDto(EmploymentEntity employment);
}


package nl.pensioenmeloen.calculator.mapper;

import nl.pensioenmeloen.calculator.dto.Pension;
import nl.pensioenmeloen.calculator.repository.entities.EmploymentEntity;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PensionMapper {

    PensionMapper INSTANCE = Mappers.getMapper(PensionMapper.class);

    @Mapping(source = "", target = "")
    Pension EntityToDto(UserEntity user, EmploymentEntity employment);
}

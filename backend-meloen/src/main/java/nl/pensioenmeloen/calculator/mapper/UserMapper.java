package nl.pensioenmeloen.calculator.mapper;

import nl.pensioenmeloen.calculator.dto.User;
import nl.pensioenmeloen.calculator.repository.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source="id", target= "id")
    @Mapping(source="firstname", target= "firstname")
    @Mapping(source="lastname", target= "lastname")
    @Mapping(source="email", target= "email")
    @Mapping(source="dateOfBirth", target= "dateOfBirth")
    @Mapping(source="street", target= "street")
    @Mapping(source="city", target= "city")
    @Mapping(source="zip", target= "zip")
    @Mapping(source="housenumber", target= "housenumber")
    @Mapping(source="housenumberAddition", target= "housenumberAddition")
    @Mapping(source="preferredRetireAge", target= "preferredRetireAge")
    @Mapping(source="yearlyDeposit", target= "yearlyDeposit")
    User entityToDto(UserEntity entity);

    @Mapping(source="id", target= "id")
    @Mapping(source="firstname", target= "firstname")
    @Mapping(source="lastname", target= "lastname")
    @Mapping(source="email", target= "email")
    @Mapping(source="dateOfBirth", target= "dateOfBirth")
    @Mapping(source="street", target= "street")
    @Mapping(source="city", target= "city")
    @Mapping(source="zip", target= "zip")
    @Mapping(source="housenumber", target= "housenumber")
    @Mapping(source="housenumberAddition", target= "housenumberAddition")
    @Mapping(source="preferredRetireAge", target= "preferredRetireAge")
    UserEntity dtoToEntity(User user);

}

package com.ecommerce_microservices.service_user.dto;

import com.ecommerce_microservices.service_user.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}

package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.User.CreateUserRequest;
import com.nikdiba.store.apiModel.User.CreateUserResponse;
import com.nikdiba.store.apiModel.User.LoginResponse;
import com.nikdiba.store.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper Instance = Mappers.getMapper(UserMapper.class);

    User map(CreateUserRequest request);

    CreateUserResponse map(User user);

    LoginResponse loginMap(User user);


}

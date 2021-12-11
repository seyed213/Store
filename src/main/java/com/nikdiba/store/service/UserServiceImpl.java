package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.UserMapper;
import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.apiModel.User.CreateUserRequest;
import com.nikdiba.store.apiModel.User.CreateUserResponse;
import com.nikdiba.store.apiModel.User.LoginRequest;
import com.nikdiba.store.apiModel.User.LoginResponse;
import com.nikdiba.store.entity.User;
import com.nikdiba.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public CreateUserResponse create(CreateUserRequest request) throws Exception {

        User user = UserMapper.Instance.map(request);

        User createdUser = userRepository.save(user);

        CreateUserResponse response = UserMapper.Instance.map(createdUser);

        return response;
    }

    @Override
    public LoginResponse login(LoginRequest request) throws Exception {

        User user = userRepository.login(request.getPhoneNumber(), request.getPassword());

        if (user == null) throw new Exception("LoginFailed");
        else return UserMapper.Instance.loginMap(user);


    }
}

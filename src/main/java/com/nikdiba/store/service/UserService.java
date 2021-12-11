package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.User.CreateUserRequest;
import com.nikdiba.store.apiModel.User.CreateUserResponse;
import com.nikdiba.store.apiModel.User.LoginRequest;
import com.nikdiba.store.apiModel.User.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

   CreateUserResponse create(CreateUserRequest request) throws Exception;

   LoginResponse login(LoginRequest request) throws Exception;




}

package com.nikdiba.store.controller;

import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.apiModel.User.CreateUserRequest;
import com.nikdiba.store.apiModel.User.CreateUserResponse;
import com.nikdiba.store.apiModel.User.LoginRequest;
import com.nikdiba.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<?> userCreate(@RequestBody @Valid CreateUserRequest request) {
        try {
            return ResponseEntity.ok().body(new ApiResponse("user created", userService.create(request)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("user not created");
        }
    }


    @PostMapping("/user/login")

    public ResponseEntity<?> login(@RequestBody @Valid LoginRequest request) {
        try {
            return ResponseEntity.ok().body(userService.login(request));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("update failed");
        }
    }

}

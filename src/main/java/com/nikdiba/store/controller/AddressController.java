package com.nikdiba.store.controller;

import com.nikdiba.store.apiModel.Address.CreateAddressRequest;
import com.nikdiba.store.apiModel.Address.CreateAddressResponse;
import com.nikdiba.store.apiModel.Address.UpdateAddressRequest;
import com.nikdiba.store.apiModel.Address.UpdateAddressResponse;
import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("address/create")
    public ResponseEntity<?> createAddress(@Valid @RequestBody CreateAddressRequest request) {
        try {
            return ResponseEntity.ok(new ApiResponse("new address is created", addressService.create(request)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("address not create");
        }

    }


}

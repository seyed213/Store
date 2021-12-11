package com.nikdiba.store.controller;

import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.apiModel.product.CreateProductRequest;
import com.nikdiba.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/create")
    public ResponseEntity<?> create(@RequestBody @Valid CreateProductRequest request) {

        try {
            return ResponseEntity.ok(new ApiResponse("product created", productService.create(request)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("product not create");
        }
    }

}



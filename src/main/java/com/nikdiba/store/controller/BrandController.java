package com.nikdiba.store.controller;

import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.Brand.UpdateBrandRequest;
import com.nikdiba.store.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("/brand/create")
    public ResponseEntity<?> createBrand(@RequestBody @Valid CreateBrandRequest request) {
        try {
            return ResponseEntity.ok(new ApiResponse("Brand created ", brandService.creat(request)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("brand not create");

        }
    }

    @PostMapping("brand/update")
    public ResponseEntity<?> brandUpdate(@Valid @RequestBody UpdateBrandRequest request) {
        try {

            return ResponseEntity.ok().body(brandService.update(request));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("brand is updated");
        }


    }

}


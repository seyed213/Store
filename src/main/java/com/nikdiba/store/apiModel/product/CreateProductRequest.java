package com.nikdiba.store.apiModel.product;


import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.image.CreateImageRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductRequest {

    private CreateBrandRequest brand;
    private CreateImageRequest image;

    @NotBlank
    private String name;

    @NotNull
    private double price;

    @NotBlank
    private String description;


}

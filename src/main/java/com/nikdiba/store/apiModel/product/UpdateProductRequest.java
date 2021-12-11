package com.nikdiba.store.apiModel.product;

import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.image.CreateImageRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateProductRequest {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private CreateBrandRequest brand;

    @NotNull
    private CreateImageRequest image;


}

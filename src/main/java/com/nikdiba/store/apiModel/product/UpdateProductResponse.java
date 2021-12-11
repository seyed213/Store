package com.nikdiba.store.apiModel.product;

import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.image.CreateImageRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateProductResponse {

    private Long id;
    private String name;
    private String description;
    private CreateBrandRequest brand;
    private CreateImageRequest image;

}

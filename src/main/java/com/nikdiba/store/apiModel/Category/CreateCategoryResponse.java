package com.nikdiba.store.apiModel.Category;

import com.nikdiba.store.apiModel.Brand.CreateBrandResponse;
import com.nikdiba.store.apiModel.product.CreateProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryResponse {

    private Long id;
    private String name;
    private CreateBrandResponse brand;
    private CreateProductResponse product;
}

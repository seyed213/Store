package com.nikdiba.store.apiModel.product;


import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.Brand.CreateBrandResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProductResponse {

    private Long id;
    private String name;
    private double price;
    private String description;
    private CreateBrandResponse brand;
}

package com.nikdiba.store.apiModel.Order;

import com.nikdiba.store.apiModel.ProductModel;
import com.nikdiba.store.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductModelResponse {
    private Long id;
    private ProductModel product;
    private Double price;
}

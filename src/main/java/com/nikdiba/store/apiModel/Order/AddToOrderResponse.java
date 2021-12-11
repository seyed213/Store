package com.nikdiba.store.apiModel.Order;

import com.nikdiba.store.apiModel.OrderProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddToOrderResponse {

    private Long id;
    private List<OrderProductModel> orderProducts;
    private Double totalPrice;
}

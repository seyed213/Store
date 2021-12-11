package com.nikdiba.store.apiModel.Order;

import com.nikdiba.store.apiModel.Address.AddressModelResponse;
import com.nikdiba.store.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetOrderByIdResponse {

    private Long id;
    private AddressModelResponse addressModelResponse;
    private List<OrderProductModelResponse> orderProduct;
    private Double totalPrice;
    private String status;

}

package com.nikdiba.store.apiModel.Order;

import com.nikdiba.store.apiModel.User.CreateUserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponse {

    private Long id;
    private String fullAddress;
    private CreateUserResponse user;
}

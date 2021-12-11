package com.nikdiba.store.apiModel.Order;

import com.nikdiba.store.apiModel.Address.CreateAddressRequest;
import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.User.CreateUserRequest;
import com.nikdiba.store.apiModel.product.CreateProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderRequest {

    @NotNull
    private IdModel user;

    @NotNull
    private IdModel address;


}

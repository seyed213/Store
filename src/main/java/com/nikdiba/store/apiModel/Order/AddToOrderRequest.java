package com.nikdiba.store.apiModel.Order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddToOrderRequest {

    @NotNull
    private Long productId;

    @NotNull
    private Long userId;


}

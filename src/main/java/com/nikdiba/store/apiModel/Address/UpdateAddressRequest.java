package com.nikdiba.store.apiModel.Address;

import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.product.CreateProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAddressRequest {

    @NotNull
    private Long id;

    @NotBlank
    private String fullAddress;

    @NotNull
    private IdModel user;
}

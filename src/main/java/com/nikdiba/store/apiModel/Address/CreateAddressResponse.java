package com.nikdiba.store.apiModel.Address;

import com.nikdiba.store.apiModel.User.CreateUserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAddressResponse {

    private Long id;

    private String fullAddress;

    private CreateUserResponse user;
}

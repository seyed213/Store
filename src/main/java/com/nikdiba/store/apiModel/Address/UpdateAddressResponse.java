package com.nikdiba.store.apiModel.Address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.User.CreateUserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAddressResponse {

    private Long id;
    private String fullAddress;
    private CreateUserResponse user;

}

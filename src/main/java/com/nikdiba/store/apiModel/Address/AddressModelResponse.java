package com.nikdiba.store.apiModel.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressModelResponse {
    private Long id;
    private String fullAddress;
}

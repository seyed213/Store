package com.nikdiba.store.apiModel.Brand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindBrandByNameResponse {

    private CreateBrandResponse response;

}

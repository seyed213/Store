package com.nikdiba.store.apiModel.Brand;

import com.nikdiba.store.apiModel.image.CreateImageResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateBrandResponse {

    private String name;
    private String description;
    private CreateImageResponse image;


}

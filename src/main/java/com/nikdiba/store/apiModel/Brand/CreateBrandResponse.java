package com.nikdiba.store.apiModel.Brand;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.image.CreateImageResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBrandResponse {

    private Long id;
    private String name;
    private String description;
    private IdModel imageResponse;

}

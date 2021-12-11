package com.nikdiba.store.apiModel.Brand;

import com.nikdiba.store.Mapper.BrandMapper;
import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.image.CreateImageResponse;
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
public class CreateBrandRequest {

    private IdModel image;

    @NotBlank
    private String name;

    @NotBlank
    private String description;


}

package com.nikdiba.store.apiModel.Category;

import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.IdModel;
import com.nikdiba.store.apiModel.product.CreateProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryRequest {

    @NotBlank
    private String name;

    @NotNull
    private IdModel brand;




}

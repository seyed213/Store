package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.Category.CreateCategoryRequest;
import com.nikdiba.store.apiModel.Category.CreateCategoryResponse;
import com.nikdiba.store.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper Instance = Mappers.getMapper(CategoryMapper.class);

    Category map(CreateCategoryRequest request);

    CreateCategoryResponse map(Category category);

}

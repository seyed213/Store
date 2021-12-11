package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.Category.CreateCategoryRequest;
import com.nikdiba.store.apiModel.Category.CreateCategoryResponse;
import com.nikdiba.store.entity.Category;

import java.util.List;

public interface CategoryService {

    CreateCategoryResponse create(CreateCategoryRequest request);

}

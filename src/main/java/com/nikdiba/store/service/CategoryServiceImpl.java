package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.CategoryMapper;
import com.nikdiba.store.apiModel.Category.CreateCategoryRequest;
import com.nikdiba.store.apiModel.Category.CreateCategoryResponse;
import com.nikdiba.store.entity.Category;
import com.nikdiba.store.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public CreateCategoryResponse create(CreateCategoryRequest request) {

        Category category = CategoryMapper.Instance.map(request);

        Category createdCategory = categoryRepository.save(category);

        CreateCategoryResponse response = CategoryMapper.Instance.map(createdCategory);

        return response;
    }


}


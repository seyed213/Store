package com.nikdiba.store.controller;

import com.nikdiba.store.apiModel.Category.CreateCategoryRequest;
import com.nikdiba.store.apiModel.Category.CreateCategoryResponse;
import com.nikdiba.store.entity.Category;
import com.nikdiba.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/category/create")
    public ResponseEntity<?> create(@RequestBody CreateCategoryRequest request) {
        CreateCategoryResponse createdCategory = categoryService.create(request);
        return ResponseEntity.ok().body("create the category" + createdCategory);
    }
}

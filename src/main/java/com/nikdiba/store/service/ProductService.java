package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.product.CreateProductRequest;
import com.nikdiba.store.apiModel.product.CreateProductResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    CreateProductResponse create(CreateProductRequest request);

}

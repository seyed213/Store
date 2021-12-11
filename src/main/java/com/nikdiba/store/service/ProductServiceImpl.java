package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.ProductMapper;
import com.nikdiba.store.apiModel.product.CreateProductRequest;
import com.nikdiba.store.apiModel.product.CreateProductResponse;
import com.nikdiba.store.entity.Product;
import com.nikdiba.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public CreateProductResponse create(CreateProductRequest request) {

        Product product = ProductMapper.Instance.map(request);
        Product createdProduct = productRepository.save(product);
        CreateProductResponse response = ProductMapper.Instance.map(createdProduct);


        return response;
    }
}

package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.product.CreateProductRequest;
import com.nikdiba.store.apiModel.product.CreateProductResponse;
import com.nikdiba.store.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper Instance = Mappers.getMapper(ProductMapper.class);

    Product map(CreateProductRequest request);

    CreateProductResponse map(Product product);
}

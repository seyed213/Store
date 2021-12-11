package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.Brand.CreateBrandRequest;
import com.nikdiba.store.apiModel.Brand.CreateBrandResponse;
import com.nikdiba.store.apiModel.Brand.UpdateBrandRequest;
import com.nikdiba.store.apiModel.Brand.UpdateBrandResponse;
import com.nikdiba.store.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {

    BrandMapper I = Mappers.getMapper(BrandMapper.class);

    Brand map(CreateBrandRequest request);

    CreateBrandResponse map(Brand brand);

    Brand map(UpdateBrandRequest request);

    UpdateBrandResponse updateMap(Brand brand);
}


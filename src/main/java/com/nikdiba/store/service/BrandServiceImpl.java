package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.BrandMapper;
import com.nikdiba.store.apiModel.Brand.*;
import com.nikdiba.store.entity.Brand;
import com.nikdiba.store.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;


    @Override
    public CreateBrandResponse creat(CreateBrandRequest request) throws Exception {

        Brand brand = BrandMapper.I.map(request);

        Brand createdBrand = brandRepository.save(brand);

        CreateBrandResponse response = BrandMapper.I.map(createdBrand);

        return response;

    }

    @Override
    public UpdateBrandResponse update(UpdateBrandRequest request) throws Exception {

        Brand brand = BrandMapper.I.map(request);
        Brand updatedBrand = brandRepository.save(brand);
        UpdateBrandResponse response = BrandMapper.I.updateMap(updatedBrand);

        return response;
    }

    @Override
    public FindBrandByNameResponse findById(FindBrandByNameRequest request) {


        return null;
    }
}

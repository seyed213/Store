package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.Brand.*;

public interface BrandService {

    CreateBrandResponse creat(CreateBrandRequest request) throws Exception;


    UpdateBrandResponse update(UpdateBrandRequest request) throws Exception;

    FindBrandByNameResponse findById(FindBrandByNameRequest request);

}

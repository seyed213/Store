package com.nikdiba.store.service;

import com.nikdiba.store.entity.Image;

import java.util.List;

public interface ImageService {
    Image create(Image image);

    Image findById(Long id);

    List<Image> getAll();

    Image update(Image image);

    void deleteById(Long id);

}

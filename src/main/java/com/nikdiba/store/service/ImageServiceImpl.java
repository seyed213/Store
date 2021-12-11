package com.nikdiba.store.service;

import com.nikdiba.store.entity.Image;
import com.nikdiba.store.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {


    @Autowired
    private ImageRepository imageRepository;


    @Override
    public Image create(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image findById(Long id) {
        return null;
    }

    @Override
    public List<Image> getAll() {
        return null;
    }

    @Override
    public Image update(Image image) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

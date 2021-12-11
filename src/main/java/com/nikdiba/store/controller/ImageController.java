package com.nikdiba.store.controller;

import com.nikdiba.store.entity.Image;
import com.nikdiba.store.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping("/image/create")
    public ResponseEntity<?> create(@RequestBody Image image) {
        Image createdImage = imageService.create(image);
        return ResponseEntity.ok().body(createdImage);
    }

}

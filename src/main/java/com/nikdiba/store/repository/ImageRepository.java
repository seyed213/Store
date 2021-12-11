package com.nikdiba.store.repository;

import com.nikdiba.store.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}

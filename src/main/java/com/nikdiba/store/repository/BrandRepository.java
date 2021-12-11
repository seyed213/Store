package com.nikdiba.store.repository;

import com.nikdiba.store.entity.Brand;
import com.nikdiba.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Long> {


}

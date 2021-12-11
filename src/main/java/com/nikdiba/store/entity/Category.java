package com.nikdiba.store.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")

public class Category extends BaseEntity {

    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Category category_id;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private List<Image> image;



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "category_brands",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "brand_id"))
    private List<Brand> brands;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Product_category",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;


}

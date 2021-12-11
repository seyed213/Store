package com.nikdiba.store.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")

public class Product extends BaseEntity {

    @NotNull
    @Column(unique = true)
    private String name;

    private double price;
    private String description;
    private LocalTime create_date;
    private LocalTime modification_date;
    private int is_enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;


    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<Image> images;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "category_brands",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> category;


}


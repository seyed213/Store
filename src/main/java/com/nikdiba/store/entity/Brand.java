package com.nikdiba.store.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "brand")
public class Brand extends BaseEntity {


    @NotBlank
    @Column(unique = true)
    private String name;

    @NotBlank
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private Image image;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "category_brands",
            joinColumns = @JoinColumn(name = "brand_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> category;

}

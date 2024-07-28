package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CategoryName", nullable = false)
    private String categoryName;

    @Column(name = "CategoryDescription")
    private String categoryDescription;

    @ManyToOne
    @JoinColumn(name = "ParentCategoryID")
    private Category parentCategory;
}

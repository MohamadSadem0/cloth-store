package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idn;

    @Column(name = "ProductName", nullable = false)
    private String productName;

    @Column(name = "ProductDescription")
    private String productDescription;

    @Column(name = "Price", nullable = false)
    private BigDecimal price;

    @Column(name = "QuantityInStock", nullable = false)
    private Integer quantityInStock;

    @ManyToOne
    @JoinColumn(name = "StoreID", nullable = false)
    private Store store;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private Category category;

    @Column(name = "DateAdded", nullable = false, updatable = false)
    private Timestamp dateAdded;

    @Column(name = "SKU")
    private String sku;

    @Column(name = "Size")
    private String size;

    @Column(name = "Color")
    private String color;

    @Column(name = "Material")
    private String material;
}

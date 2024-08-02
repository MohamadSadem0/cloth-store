package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StoreID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private User user;

    @Column(name = "StoreName", nullable = false)
    private String storeName;

    @Column(name = "StoreDescription")
    private String storeDescription;

    @Column(name = "StoreLogoUrl")
    private String storeLogoUrl;

    @Column(name = "StoreUrl", unique = true)
    private String storeUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StoreAddressID", referencedColumnName = "ID")
    private Address storeAddress;

    @Column(name = "CreatedAt")
    private Date createdAt;

    @Column(name = "UpdatedAt")
    private Date updatedAt;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive;
}

package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "WishlistItems")
public class WishlistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WishlistItemID")
    private Long wishlistItemId;

    @ManyToOne
    @JoinColumn(name = "WishlistID", nullable = false)
    private Wishlist wishlist;

    @ManyToOne
    @JoinColumn(name = "ProductID", nullable = false)
    private Product product;

    @Column(name = "CreatedAt")
    private Date createdAt;
}

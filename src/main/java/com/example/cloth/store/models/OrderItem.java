package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "OrderItem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderItemID")
    private Long orderItemID;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ProductID", nullable = false)
    private Product product;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    @Column(name = "Price", nullable = false)
    private BigDecimal price;

    @Column(name = "Discount", nullable = false)
    private BigDecimal discount;

    @Column(name = "TotalPrice", nullable = false, updatable = false)
    private BigDecimal totalPrice;

    @PostLoad
    private void calculateTotalPrice() {
        this.totalPrice = price.subtract(discount).multiply(BigDecimal.valueOf(quantity));
    }
}

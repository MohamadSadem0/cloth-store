package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "BranchName", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "StoreID", nullable = false)
    private Store store;

    @ManyToOne
    @JoinColumn(name = "AddressID", nullable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "BranchManagerID")
    private User branchManager;

    @Column(name = "DateCreated", nullable = false, updatable = false)
    private Timestamp dateCreated;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", nullable = false)
    private BranchStatus status;

    public enum BranchStatus {
        ACTIVE, INACTIVE
    }
}

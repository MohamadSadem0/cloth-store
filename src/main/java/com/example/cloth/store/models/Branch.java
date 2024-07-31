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
@Table(name = "Branches")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BranchID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "StoreID", nullable = false)
    private Store store;

    @Column(name = "BranchName", nullable = false)
    private String branchName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BranchAddressID", referencedColumnName = "ID")
    private Address branchAddress;

    @Column(name = "CreatedAt")
    private Date createdAt;

    @Column(name = "UpdatedAt")
    private Date updatedAt;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive;
}

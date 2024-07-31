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
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BranchID", nullable = false)
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "UserID", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "Role", nullable = false)
    private EmployeeRole role;

    @Column(name = "CreatedAt")
    private Date createdAt;

    @Column(name = "UpdatedAt")
    private Date updatedAt;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive;

    public enum EmployeeRole {
        MANAGER, SELLER, CASHIER
    }
}

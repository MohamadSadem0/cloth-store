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
@Table(name = "Store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "StoreName", nullable = false)
    private String name;

    @Column(name = "StoreDescription")
    private String description;

    @Column(name = "DateCreated", nullable = false, updatable = false)
    private Timestamp dateCreated;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", nullable = false)
    private Status status;

    public enum Status {
        ACTIVE, INACTIVE
    }

    @OneToOne
    @JoinColumn(name = "Branch_ID", referencedColumnName = "ID")
    private Branch branch;
}

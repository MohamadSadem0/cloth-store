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
@Table(name = "Store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id; // Field name should be camelCase for Java conventions

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "dateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Column(name = "status")
    private char status;

    @OneToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "Id")
    private Branch branch;
}

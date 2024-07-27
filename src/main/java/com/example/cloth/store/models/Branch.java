package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id; // Field name should be camelCase for Java conventions

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Store store;
}

package com.example.cloth.store.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "storeUser")
public class StoreUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @OneToOne(mappedBy = "storeUser", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Store store;

    @Column(name = "Role")
    private String role;
}

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
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "PhoneNumber", length = 20)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "Role", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;

    @Column(name = "DateCreated", nullable = false, updatable = false)
    private Timestamp dateCreated;

    @Column(name = "LastLogin")
    private Timestamp lastLogin;

    public enum Role {
        CUSTOMER, StoreOwner, StoreWorker
    }
}

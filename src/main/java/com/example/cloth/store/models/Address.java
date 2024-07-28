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
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Street", nullable = false)
    private String street;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "State", nullable = false)
    private String state;

    @Column(name = "ZipCode", nullable = false)
    private String zipCode;

    @Column(name = "Country", nullable = false)
    private String country;

    @Enumerated(EnumType.STRING)
    @Column(name = "AddressType", nullable = false)
    private AddressType addressType;

    public enum AddressType {
        SHIPPING, BILLING
    }
}

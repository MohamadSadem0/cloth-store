package com.example.cloth.store.models;

import com.example.cloth.store.enums.AddressType;
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
    private Long id;

    @Column(name = "Street", nullable = false)
    private String street;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "State", nullable = true)
    private String state;

    @Column(name = "ZipCode", nullable = true)
    private String zipCode;

    @Column(name = "Country", nullable = false)
    private String country;

    @Enumerated(EnumType.STRING)
    @Column(name = "AddressType", nullable = false)
    private AddressType addressType;


}

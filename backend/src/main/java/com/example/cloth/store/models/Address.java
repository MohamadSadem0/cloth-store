package com.example.cloth.store.models;

import com.example.cloth.store.enums.AddressType;
import com.example.cloth.store.models.addressModels.Country;
import com.example.cloth.store.models.addressModels.State;
import com.example.cloth.store.models.addressModels.Street;
import com.example.cloth.store.models.addressModels.ZipCode;
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

    @ManyToOne
    @JoinColumn(name = "StreetID", nullable = false)
    private Street street;

    @Column(name = "City", nullable = false)
    private String city;

    @ManyToOne
    @JoinColumn(name = "StateID", nullable = true)
    private State state;

    @ManyToOne
    @JoinColumn(name = "ZipCodeID", nullable = true)
    private ZipCode zipCode;

    @ManyToOne
    @JoinColumn(name = "CountryID", nullable = false)
    private Country country;

    @Enumerated(EnumType.STRING)
    @Column(name = "AddressType", nullable = false)
    private AddressType addressType;

}

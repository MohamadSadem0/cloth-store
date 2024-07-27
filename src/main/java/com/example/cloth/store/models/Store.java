package com.example.cloth.store.models;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name="Store")
public class Store {
    @Column(name = "Id")
    @Id
    private Long Id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="dateCreated")
    private Date dateCreated;
    @Column(name="status")
    private char status;
}

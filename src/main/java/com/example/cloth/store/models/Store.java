package com.example.cloth.store.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name="Store")
public class Store {
    @Column(name = "Id")
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

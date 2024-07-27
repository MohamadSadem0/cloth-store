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
    @Column(name = "Id")
    @Id
    private Long Id;
    @Column(name = "name")
    private String name;
    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Store store;

}

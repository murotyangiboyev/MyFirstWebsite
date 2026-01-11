package com.example.myfirstwebsite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "address")

@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "houseNumber")
    private Long houseNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
}

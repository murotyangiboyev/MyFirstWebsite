package com.example.myfirstwebsite.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model", length = 20)
    private String model;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
}

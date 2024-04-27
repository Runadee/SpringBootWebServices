package com.example.springboot.entity;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( nullable = false)
    private String firstName;
    @Column( nullable = false)
    private String lastName;
    @Column( nullable = false, unique = true)
    private String email;


}

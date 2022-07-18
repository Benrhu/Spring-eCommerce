package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "username")
    private String userName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code")
    private String zipCode;
    private String role;

    public User() {}

    public User(Long userId, String userName, String surname, String email, String password, String phone, String address, String city, String country, String zipCode, String role) {
        this.userId = userId;
        this.userName = userName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.role = role;
    }
}

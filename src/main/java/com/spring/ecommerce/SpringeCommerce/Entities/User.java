package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Component
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private List<Order> orders;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Invoice> invoices;

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

    @Column(name = "postalCode")
    private String zipCode;

    public User() {}

    public User(Long userId, List<Order> orders, List<Invoice> invoices, String userName, String surname, String email, String password, String phone, String address, String city, String country, String zipCode) {
        this.userId = userId;
        this.orders = orders;
        this.invoices = invoices;
        this.userName = userName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}

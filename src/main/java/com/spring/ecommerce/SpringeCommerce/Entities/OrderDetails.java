package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orderDetails")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailsId;

    @Column(name = "productId")
    private Product productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "productPrice")
    private double productPrice;

    @Column(name = "totalPrice")
    private double totalPrice;

    public OrderDetails() {}

    public OrderDetails(Long orderDetailsId, Product productId, double quantity, double productPrice, double totalPrice) {
        this.orderDetailsId = orderDetailsId;
        this.productId = productId;
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
    }
}

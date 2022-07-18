package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "oderDate")
    private String orderDate;

    @Column(name = "orderStatus")
    private String orderStatus;

    @Column(name = "orderTotal")
    private String orderTotal;

    @Column(name = "orderUser")
    private String orderUser;

    @Column(name = "receivedDate")
    private String receivedDate;

    public Order() {}

    public Order(Long orderId, String orderDate, String orderStatus, String orderTotal, String orderUser, String receivedDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderTotal = orderTotal;
        this.orderUser = orderUser;
        this.receivedDate = receivedDate;
    }
}

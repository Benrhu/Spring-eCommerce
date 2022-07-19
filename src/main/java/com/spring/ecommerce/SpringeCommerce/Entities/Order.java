package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@Component
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "userId")
    private User userId;

    @Column(name = "oderDate")
    private Date orderDate;

    @Column(name = "orderStatus")
    private Boolean orderStatus;

    @Column(name = "orderTotal")
    private Integer orderTotal;

    @Column(name = "receivedDate")
    private Date receivedDate;

    public Order() {}

    public Order(Long orderId, User userId, Date orderDate, Boolean orderStatus, Integer orderTotal, Date receivedDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderTotal = orderTotal;
        this.receivedDate = receivedDate;
    }
}

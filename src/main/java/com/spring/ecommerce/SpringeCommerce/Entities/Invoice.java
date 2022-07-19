package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "userId", unique = true)
    private User userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId", unique = true)
    private Order orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId", unique = true)
    private Product productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "productPrice")
    private double productPrice;

    @Column(name = "totalPrice")
    private double totalPrice;

    public Invoice() {}

    public Invoice(Long invoiceId, User userId, Order orderId, Product productId, double quantity, double productPrice, double totalPrice) {
        this.invoiceId = invoiceId;
        this.userId = userId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
    }
}

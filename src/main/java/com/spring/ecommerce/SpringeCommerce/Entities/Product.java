package com.spring.ecommerce.SpringeCommerce.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productImg")
    private String productImage;

    @Column(name = "productPrice")
    private String productPrice;

    @Column(name = "productCategory")
    private String productCategory;

    public Product() {}

    public Product(Long productId, String productName, String productDescription, String productImage, String productPrice, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }


}

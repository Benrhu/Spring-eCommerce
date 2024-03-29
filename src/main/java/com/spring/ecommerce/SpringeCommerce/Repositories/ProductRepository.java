package com.spring.ecommerce.SpringeCommerce.Repositories;

import com.spring.ecommerce.SpringeCommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

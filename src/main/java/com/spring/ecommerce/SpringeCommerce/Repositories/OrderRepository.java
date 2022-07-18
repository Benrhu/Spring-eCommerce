package com.spring.ecommerce.SpringeCommerce.Repositories;

import com.spring.ecommerce.SpringeCommerce.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}


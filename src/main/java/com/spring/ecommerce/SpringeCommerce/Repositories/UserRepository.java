package com.spring.ecommerce.SpringeCommerce.Repositories;

import com.spring.ecommerce.SpringeCommerce.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

package com.spring.ecommerce.SpringeCommerce.Repositories;

import com.spring.ecommerce.SpringeCommerce.Entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}

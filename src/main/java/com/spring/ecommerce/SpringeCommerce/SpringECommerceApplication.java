package com.spring.ecommerce.SpringeCommerce;

import com.spring.ecommerce.SpringeCommerce.Repositories.InvoiceRepository;
import com.spring.ecommerce.SpringeCommerce.Repositories.OrderRepository;
import com.spring.ecommerce.SpringeCommerce.Repositories.ProductRepository;
import com.spring.ecommerce.SpringeCommerce.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringECommerceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringECommerceApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		OrderRepository orderRepository = context.getBean(OrderRepository.class);
		InvoiceRepository invoiceRepository = context.getBean(InvoiceRepository.class);
		ProductRepository productRepository = context.getBean(ProductRepository.class);

		System.out.println("Hola Mundo");
	}

}
package com.devsuperior.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1 implements CommandLineRunner{
	
	@Autowired
	private OrderService orderservice;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Order order1= new Order (1034,150.0,20.0);
		Order order2= new Order (2282,800.0,10.0);
		Order order3= new Order (1309,95.90,0.0);
		
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor Total " + orderservice.total(order1) );
		
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor Total " + orderservice.total(order2) );
		
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor Total " + orderservice.total(order3) );
		
	}

}

package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingservice; 
	
	public Double total (Order order) {
		Double desconto=(order.getBasic() * order.getDiscount()/100) ;
		Double frete =shippingservice.shipment(order);
		Double total =order.getBasic()-desconto+frete;
		return total;
		
			   
	}

	

}

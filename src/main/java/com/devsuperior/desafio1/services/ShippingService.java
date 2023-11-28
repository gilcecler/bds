package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	
   public Double shipment (Order order) {
	   
	      Double basic= order.getBasic();
	      if (basic < 100) {
	    	  return 20.0;
	      } 
	      else if  (basic >100 && basic <=200){
	    	  return  12.0;
	      }
	      else {return 0.00;}
	    	     
   }

}

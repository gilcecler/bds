package com.devsuperior.desafioapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafioapirest.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

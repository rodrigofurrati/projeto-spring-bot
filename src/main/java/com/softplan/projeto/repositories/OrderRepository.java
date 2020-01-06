package com.softplan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softplan.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

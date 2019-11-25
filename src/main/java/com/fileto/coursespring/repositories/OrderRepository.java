package com.fileto.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileto.coursespring.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

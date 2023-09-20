package com.aprendendomioto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendomioto.course.entities.OrderItem;
import com.aprendendomioto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
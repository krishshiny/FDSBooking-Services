package com.fds.services.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fds.services.model.Order;


public interface OrderRepository extends MongoRepository<Order,String>{

}

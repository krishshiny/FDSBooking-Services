package com.fds.services.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fds.services.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, Integer>{

}

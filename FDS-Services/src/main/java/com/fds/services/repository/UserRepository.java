package com.fds.services.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.fds.services.model.User;


public interface UserRepository extends MongoRepository<User,String>{

}

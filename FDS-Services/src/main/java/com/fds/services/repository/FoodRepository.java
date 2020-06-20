package com.fds.services.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.fds.services.model.Food;



public interface FoodRepository extends MongoRepository<Food,Integer>{

	@Query("{'price': {$gte: ?0, $lte:?1 }}")
	List<Food> findFoodByprice(Integer priceFrom,Integer priceTo);
}

package com.fds.services.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.fds.services.model.Restarants;

public interface RestarantsRepository extends MongoRepository<Restarants, Integer> {

	@Query("{rating : ?0}")
	List<Restarants> findRestarantsByRating(String rating);

}

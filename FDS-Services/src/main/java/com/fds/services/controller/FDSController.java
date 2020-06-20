package com.fds.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fds.services.model.Food;
import com.fds.services.model.Order;
import com.fds.services.model.Restarants;
import com.fds.services.repository.FoodRepository;
import com.fds.services.repository.OrderRepository;
import com.fds.services.repository.RestarantsRepository;

@RestController
@RequestMapping("fds/v1")
public class FDSController {

	@Autowired
	private FoodRepository foodRespository;

	@Autowired
	private RestarantsRepository restarantsReository;

	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/getAllFood")
	public ResponseEntity<List<Food>> getAllFoodItems() {

		List<Food> foodList = foodRespository.findAll();

		return new ResponseEntity<>(foodList, HttpStatus.OK);
	}

	@GetMapping("/getAllRestarants")
	public List<Restarants> getAllRestarants() {
		return restarantsReository.findAll();
	}

	@GetMapping("/fillterRestarants")
	public List<Restarants> getRestarantsByRatings(@RequestParam(required = false) String rating,
			@RequestParam(required = false) String price) {
		if (rating != null && !rating.isEmpty()) {
			return restarantsReository.findRestarantsByRating(rating);
		}

		return restarantsReository.findAll();
	}

	@GetMapping("/fillterByPrice")
	public List<Food> getfiteredByPrice(@RequestParam(required = true) Integer priceFrom,@RequestParam(required = true) Integer priceTo) {

		return foodRepository.findFoodByprice(priceFrom,priceTo);
	}
	
	@PostMapping("/orderFood")
	public Order orderFood(@RequestBody Order order){
		return orderRepository.save(order);
	}

}

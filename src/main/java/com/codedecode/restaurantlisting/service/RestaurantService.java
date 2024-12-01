package com.codedecode.restaurantlisting.service;

import com.codedecode.restaurantlisting.dto.RestaurantDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestaurantService {

    public List<RestaurantDTO> findAllRestaurants();

    public RestaurantDTO addRestaurant(RestaurantDTO restaurantDTO);

    public RestaurantDTO getRestaurantById(Integer id);

}

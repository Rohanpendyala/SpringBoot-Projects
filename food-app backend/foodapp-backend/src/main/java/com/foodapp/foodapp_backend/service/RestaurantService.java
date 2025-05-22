package com.foodapp.foodapp_backend.service;

import com.foodapp.foodapp_backend.entity.RestaurantEntity;
import com.foodapp.foodapp_backend.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository  restaurantRepository;


    public List<RestaurantEntity> getAllRestaurants() {
        List<RestaurantEntity> restaurant = restaurantRepository.findAll();
        return restaurant;

    }
    public RestaurantEntity addRestaurant(RestaurantEntity restaurant) {
        return restaurantRepository.save(restaurant);

    }

    public RestaurantEntity updateRestaurant(long id, RestaurantEntity restaurant) {
        Optional<RestaurantEntity> optionalRestaurant = restaurantRepository.findById(id);
        if (optionalRestaurant.isPresent()) {
            RestaurantEntity existing = optionalRestaurant.get();
            existing.setName(restaurant.getName());
            existing.setCuisine(restaurant.getCuisine());
            existing.setLocation(restaurant.getLocation());
            existing.setRating(restaurant.getRating());
            return restaurantRepository.save(existing);

        }else  {
            return null;



            }

        }
        public void deleteRestaurant(Long id){
        restaurantRepository.deleteById(id);
        }

        public RestaurantEntity getRestaurantByID(Long id){
            Optional<RestaurantEntity> optionalRestaurant = restaurantRepository.findById(id);
            if(optionalRestaurant.isPresent()){
                return optionalRestaurant.get();
            }
            else {
                return null;
            }


        }


    }



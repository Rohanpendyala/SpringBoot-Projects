package com.foodapp.foodapp_backend.controller;

import com.foodapp.foodapp_backend.entity.RestaurantEntity;
import com.foodapp.foodapp_backend.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<RestaurantEntity> getAll(){
        return  restaurantService.getAllRestaurants();

    }

    @PostMapping
    public RestaurantEntity add(@RequestBody RestaurantEntity restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public RestaurantEntity updateRestaurant(@PathVariable Long id, @RequestBody RestaurantEntity restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    @GetMapping("/{id}")
    public RestaurantEntity getRestaurantByID(@PathVariable Long id) {
        return restaurantService.getRestaurantByID(id);

    }




}

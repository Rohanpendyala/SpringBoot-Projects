package com.foodapp.foodapp_backend.repository;

import com.foodapp.foodapp_backend.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}

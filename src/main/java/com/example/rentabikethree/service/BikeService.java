package com.example.rentabikethree.service;

import org.springframework.http.ResponseEntity;

public interface BikeService {

    ResponseEntity<?> getBikeByBikeNumber(String bikeNumber);
}

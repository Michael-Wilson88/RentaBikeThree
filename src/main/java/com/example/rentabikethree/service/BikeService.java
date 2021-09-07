package com.example.rentabikethree.service;

import com.example.rentabikethree.payload.request.createrequest.CreateBikeRequest;
import org.springframework.http.ResponseEntity;

public interface BikeService {

    ResponseEntity<?> getBikeByBikeNumber(String bikeNumber);
     void createBike(CreateBikeRequest createBikeRequest);
}

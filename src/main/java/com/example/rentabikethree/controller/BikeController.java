package com.example.rentabikethree.controller;

import com.example.rentabikethree.payload.request.createrequest.CreateBikeRequest;
import com.example.rentabikethree.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class BikeController {

    private BikeService bikeService;

    @Autowired
    public void setBikeService (BikeService bikeService) { this.bikeService = bikeService; }

    @GetMapping(value = "/bikes/{bikenumber}")
    public ResponseEntity<?> getBike(@PathVariable("bikeNumber") String bikeNumber) {
        return bikeService.getBikeByBikeNumber(bikeNumber);
    }

    @PostMapping(value = "/createbike")
    public ResponseEntity<?> createBike(@Valid @RequestBody CreateBikeRequest createBikeRequest) {
         bikeService.createBike(createBikeRequest);
         return new ResponseEntity<>("Bike " + createBikeRequest.getBikeNumber() + " has been created.", HttpStatus.OK);
    }
}

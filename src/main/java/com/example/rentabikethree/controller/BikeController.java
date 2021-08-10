package com.example.rentabikethree.controller;

import com.example.rentabikethree.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class BikeController {

    private BikeService bikeService;

    @Autowired
    public void setBikeService (BikeService bikeService) { this.bikeService = bikeService; }

    @GetMapping(value = "/bikes/{bikenumber}")
    public ResponseEntity<?> getBike(@PathVariable("bikeNumber") String bikeNumber) {
        return bikeService.getBikeByBikeNumber(bikeNumber);
    }
}

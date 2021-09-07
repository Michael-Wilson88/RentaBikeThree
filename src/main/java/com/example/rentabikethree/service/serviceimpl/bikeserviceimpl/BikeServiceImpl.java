package com.example.rentabikethree.service.serviceimpl.bikeserviceimpl;

import com.example.rentabikethree.domain.bike.Bike;
import com.example.rentabikethree.exceptions.BikeExistsException;
import com.example.rentabikethree.exceptions.BikeNotFoundException;
import com.example.rentabikethree.payload.request.createrequest.CreateBikeRequest;
import com.example.rentabikethree.payload.response.ResponseBuilder;
import com.example.rentabikethree.repository.bikerepository.BikeRepository;
import com.example.rentabikethree.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

// TODO: 20-7-2021 Bouw een responseclass met een ResponseBuilder, hierin kun je Bike class definiëren

@Service
public class BikeServiceImpl implements BikeService {

    private BikeRepository bikeRepository;

    @Autowired
    public void setBikeRepository(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }


    public void createBike(CreateBikeRequest createBikeRequest) {

        Bike bike = new Bike();

        if (bikeRepository.existsByBikeNumber(createBikeRequest.getBikeNumber())) {
            throw new BikeExistsException(createBikeRequest.getBikeNumber());
        }

        bike.setBrand(createBikeRequest.getBrand());
        bike.setBikeNumber(createBikeRequest.getBikeNumber());
        bike.setFrameNumber(createBikeRequest.getFrameNumber());
        bike.setBaseRentalPrice(createBikeRequest.getBaseRentalPrice());

        bikeRepository.save(bike);
    }

    public ResponseEntity<?> getBikeByBikeNumber(String bikeNumber) {

        Optional<Bike> optionalBike = bikeRepository.findByBikeNumber(bikeNumber);
        if (optionalBike.isEmpty()) {
            throw new BikeNotFoundException(bikeNumber);
        }
        Bike bike = optionalBike.get();

        return ResponseEntity.ok(ResponseBuilder.bikeResponse(bike));
    }
//
//    if (rentalDays == 1) {
//        return  rentalPrice = bike.getBasePrice() * 1.25;
//    }
//        if (rentalDays == 2)
//
//    {
//        return rentalPrice = bike.getBasePrice() * 2.25;
//    }
//        else if (rentalDays >= 3) {
//        return rentalPrice = bike.getBasePrice() + (rentalDays * 7.5);
}

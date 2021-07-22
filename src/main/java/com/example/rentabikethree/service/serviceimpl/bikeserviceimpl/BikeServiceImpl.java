package com.example.rentabikethree.service.serviceimpl.bikeserviceimpl;

import com.example.rentabikethree.domain.bike.Bike;
import com.example.rentabikethree.payload.request.CreateBikeRequest;
import com.example.rentabikethree.repository.bikerepository.BikeRepository;
import com.example.rentabikethree.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        bike.setBrand(createBikeRequest.getBrand());
        bike.setBikeNumber(createBikeRequest.getBikeNumber());
        bike.setFrameNumber(createBikeRequest.getFrameNumber());
        bike.setBaseRentalPrice(createBikeRequest.getBaseRentalPrice());

        bikeRepository.save(bike);
    }


}

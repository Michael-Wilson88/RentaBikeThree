package com.example.rentabikethree.payload.response;

import com.example.rentabikethree.domain.bike.Bike;

public class ResponseBuilder {

    public static BikeResponse bikeResponse (Bike bike) {
        return new BikeResponse (
                bike.getId(),
                bike.getBrand(),
                bike.getBikeNumber(),
                bike.getFrameNumber(),
                bike.getBaseRentalPrice(),
                bike.getRentalDays(),
                bike.getRentalPrice(),
                bike.getReturnDate(),
                bike.isRented()
        );
    }

}

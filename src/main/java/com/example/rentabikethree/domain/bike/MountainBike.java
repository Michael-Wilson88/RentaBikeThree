package com.example.rentabikethree.domain.bike;

import java.time.LocalDate;

public class MountainBike extends Bike {

    private String size;
    private double baseRentalPrice;

    public MountainBike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        super(id, brand, bikeNumber, frameNumber, baseRentalPrice, rentalDays, rentalPrice, returnDate, isRented);
    }
}

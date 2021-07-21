package com.example.rentabikethree.domain.bike;

import java.time.LocalDate;

public class ChildMountainBike extends Bike {

    private double baseRentalPrice;

    public ChildMountainBike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        super(id, brand, bikeNumber, frameNumber, baseRentalPrice, rentalDays, rentalPrice, returnDate, isRented);
    }
}

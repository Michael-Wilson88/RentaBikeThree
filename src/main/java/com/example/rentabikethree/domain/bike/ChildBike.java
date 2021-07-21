package com.example.rentabikethree.domain.bike;

import java.time.LocalDate;

public class ChildBike extends Bike {

    private double baseRentalPrice;

    public ChildBike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        super(id, brand, bikeNumber, frameNumber, baseRentalPrice, rentalDays, rentalPrice, returnDate, isRented);
    }
}

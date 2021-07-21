package com.example.rentabikethree.domain.bike;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TandemBike extends Bike {

    @Size()
    private double baseRentalPrice;

    public TandemBike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        super(id, brand, bikeNumber, frameNumber, baseRentalPrice, rentalDays, rentalPrice, returnDate, isRented);
    }
}

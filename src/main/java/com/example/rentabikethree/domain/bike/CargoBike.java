package com.example.rentabikethree.domain.bike;

import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CargoBike extends Bike {

    @Size()
    private double baseRentalPrice;

    public CargoBike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        super(id, brand, bikeNumber, frameNumber, baseRentalPrice, rentalDays, rentalPrice, returnDate, isRented);
    }
}

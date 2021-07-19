package com.example.rentabikethree.domain.bike;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Bike {

    @Id
    @GeneratedValue
    private long id;
    private String brand;
    private String bikeNumber;
    private String frameNumber;
    private double baseRentalPrice;
    private long rentalDays;
    private double rentalPrice;
    private LocalDate returnDate;
    private boolean isRented;


}

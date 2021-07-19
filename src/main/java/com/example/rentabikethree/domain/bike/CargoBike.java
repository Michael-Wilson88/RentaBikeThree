package com.example.rentabikethree.domain.bike;

import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.Size;

public class CargoBike extends Bike {

    @Size()
    private double baseRentalPrice;

}

package com.example.rentabikethree.domain.bike;

import javax.validation.constraints.Size;

public class ElectricBike extends Bike {

    @Size(min = 20, max = 20)
    private double baseRentalPrice;

}

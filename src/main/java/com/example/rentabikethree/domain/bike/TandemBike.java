package com.example.rentabikethree.domain.bike;

import javax.validation.constraints.Size;

public class TandemBike extends Bike {

    @Size()
    private double baseRentalPrice;

}

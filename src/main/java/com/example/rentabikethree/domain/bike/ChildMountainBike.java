package com.example.rentabikethree.domain.bike;

import java.time.LocalDate;

public class ChildMountainBike extends Bike {

    private double baseRentalPrice;

    @Override
    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }

    @Override
    public void setBaseRentalPrice(double baseRentalPrice) {
        this.baseRentalPrice = baseRentalPrice;
    }
}

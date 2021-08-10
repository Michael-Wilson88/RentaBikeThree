package com.example.rentabikethree.domain.bike;

import java.time.LocalDate;

public class MountainBike extends Bike {

    private String size;
    private double baseRentalPrice;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }

    @Override
    public void setBaseRentalPrice(double baseRentalPrice) {
        this.baseRentalPrice = baseRentalPrice;
    }
}

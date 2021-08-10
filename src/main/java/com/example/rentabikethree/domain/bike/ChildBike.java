package com.example.rentabikethree.domain.bike;

public class ChildBike extends Bike {

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

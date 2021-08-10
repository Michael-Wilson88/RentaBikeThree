package com.example.rentabikethree.domain.bike;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ElectricBike extends Bike {

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

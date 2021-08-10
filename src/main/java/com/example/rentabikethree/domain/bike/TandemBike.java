package com.example.rentabikethree.domain.bike;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TandemBike extends Bike {


    private double baseRentalPrice;
    private boolean isParentChildTandem;

    @Override
    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }

    @Override
    public void setBaseRentalPrice(double baseRentalPrice) {
        this.baseRentalPrice = baseRentalPrice;
    }

    public boolean isParentChildTandem() {
        return isParentChildTandem;
    }

    public void setParentChildTandem(boolean parentChildTandem) {
        isParentChildTandem = parentChildTandem;
    }
}

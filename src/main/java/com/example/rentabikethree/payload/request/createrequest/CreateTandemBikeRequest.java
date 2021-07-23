package com.example.rentabikethree.payload.request.createrequest;

import javax.validation.constraints.Size;

public class CreateTandemBikeRequest {

    private long id;
    private String brand;
    private String bikeNumber;
    private String frameNumber;

    @Size(min = 20, max = 20)
    private double baseRentalPrice;
    private boolean isParentChildTandem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }

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
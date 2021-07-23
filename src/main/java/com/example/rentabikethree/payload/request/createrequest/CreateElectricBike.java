package com.example.rentabikethree.payload.request.createrequest;

import javax.validation.constraints.Size;

// TODO: 23-7-2021 electric bike heeft zelfde baseprice als Cargo en tandem, dus kan in 1 class  
public class CreateElectricBike {

    private long id;
    private String brand;
    private String bikeNumber;
    private String frameNumber;

    @Size(min = 20, max = 20)
    private double baseRentalPrice;

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

}

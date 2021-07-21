package com.example.rentabikethree.domain.bike;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Bike {

    @Id
    @GeneratedValue
    private long id;
    private String brand;
    private String bikeNumber;
    private String frameNumber;
    private double baseRentalPrice;
    private long rentalDays;
    private double rentalPrice;
    private LocalDate returnDate;
    private boolean isRented;

    public Bike(long id, String brand, String bikeNumber, String frameNumber, double baseRentalPrice, long rentalDays, double rentalPrice, LocalDate returnDate, boolean isRented) {
        this.id = id;
        this.brand = brand;
        this.bikeNumber = bikeNumber;
        this.frameNumber = frameNumber;
        this.baseRentalPrice = baseRentalPrice;
        this.rentalDays = rentalDays;
        this.rentalPrice = rentalPrice;
        this.returnDate = returnDate;
        this.isRented = isRented;
    }

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

    public long getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(long rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}

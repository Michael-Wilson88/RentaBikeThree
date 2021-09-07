package com.example.rentabikethree.exceptions;

public class BikeExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BikeExistsException(String bikeNumber) {
        super("Bike Nr: " + bikeNumber + " already exists.");
    }
}

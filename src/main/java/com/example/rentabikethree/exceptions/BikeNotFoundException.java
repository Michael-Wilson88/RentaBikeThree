package com.example.rentabikethree.exceptions;

public class BikeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BikeNotFoundException(String bikeNumber) {
        super("Bike nr: " + bikeNumber + " does not exist.");
    }
}

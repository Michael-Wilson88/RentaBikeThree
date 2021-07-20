package com.example.rentabikethree.service.serviceimpl;

import com.example.rentabikethree.repository.CustomerRepository;
import com.example.rentabikethree.repository.RentalRepository;
import com.example.rentabikethree.repository.bikerepository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentalServiceImpl {

    private List<Object> bikes;
    private double rentalPrice;


    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public void setRentalRepository(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }


}

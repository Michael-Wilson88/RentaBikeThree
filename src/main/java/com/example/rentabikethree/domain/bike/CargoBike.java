package com.example.rentabikethree.domain.bike;

import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CargoBike extends Bike {

    private double baseRentalPrice;


}

package com.example.rentabikethree.repository.bikerepository;

import com.example.rentabikethree.domain.bike.Bike;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Primary
public interface BikeRepository extends JpaRepository<Bike, Long> {

    Optional<Bike> findByBikeNumber(String bikeNumber);
    boolean existsByBikeNumber(String bikeNumber);
}

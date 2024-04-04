package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    @Procedure("GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModel(String model);

    // this is not working yet
    @Procedure(value = "FIND_CAR_AFTER_YEAR", refCursor = true)
    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);

//    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
//    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);
}

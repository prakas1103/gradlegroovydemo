package com.prakash.gradlegroovydemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames=true)
@Entity
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    private String model;

    @NonNull
    private int year;


}

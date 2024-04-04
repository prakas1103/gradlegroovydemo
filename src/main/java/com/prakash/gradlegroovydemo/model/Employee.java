package com.prakash.gradlegroovydemo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames=true)
@Entity
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

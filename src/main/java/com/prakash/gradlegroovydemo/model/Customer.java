package com.prakash.gradlegroovydemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
        @Column(name = "customer_name")
        private String name;

        @Id
        @Column(name = "customer_id")
        private int customerId;

        @OneToMany(fetch = FetchType.LAZY)
        @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
        private Set<OrderEntity> ordersList;

}

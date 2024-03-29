package com.prakash.gradlegroovydemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Column(name = "order_status")
    private String status;

    @Id
    @Column(name = "order_id")
    private int orderId;

}
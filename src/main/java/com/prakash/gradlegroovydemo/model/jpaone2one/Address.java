package com.prakash.gradlegroovydemo.model.jpaone2one;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String address;

    @OneToOne(mappedBy = "address")
    private User user;

    public Address(String address) {
        this.address = address;
    }
}

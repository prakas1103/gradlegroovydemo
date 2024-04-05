package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.jpaone2one.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}

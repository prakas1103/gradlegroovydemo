package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.embedded.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonTestRepository extends JpaRepository<Person,Long> {
}

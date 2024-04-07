package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.validation.ValidationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationUserRepository extends JpaRepository<ValidationUser,Long> {
}

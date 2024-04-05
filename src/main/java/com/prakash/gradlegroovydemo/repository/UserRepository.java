package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.jpaone2one.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.prakash.gradlegroovydemo.service;

import com.prakash.gradlegroovydemo.model.validation.ValidationUser;
import com.prakash.gradlegroovydemo.repository.ValidationUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationUserService {
    private final ValidationUserRepository repository;

    public ValidationUserService(ValidationUserRepository repository) {
        this.repository = repository;
    }

    public List<ValidationUser> getAllUser() {
        return repository.findAll();
    }

    public ValidationUser saveUser(ValidationUser user) {
        return repository.save(user);
    }

    public Long getUsersCount(){
        return  repository.count();
    }
}

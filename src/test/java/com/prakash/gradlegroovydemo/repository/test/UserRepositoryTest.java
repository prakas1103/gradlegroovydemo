package com.prakash.gradlegroovydemo.repository.test;

import com.prakash.gradlegroovydemo.model.jpaone2one.Address;
import com.prakash.gradlegroovydemo.model.jpaone2one.User;
import com.prakash.gradlegroovydemo.repository.UserTestRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    UserTestRepository repository;

    @Test
//    @Sql(statements = "Insert into users(id,name,address) values(4,'pk',1)",executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    public void saveUserTest(){
        Address address = new Address("chennai");
        User user = new User("pk",address);
        User savedUser = repository.save(user);
        System.out.println(savedUser);
        Assertions.assertEquals(1,repository.count());
        repository.delete(user);
        Assertions.assertEquals(0,repository.count());
    }
}

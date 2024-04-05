package com.prakash.gradlegroovydemo.repositorytest;

import com.prakash.gradlegroovydemo.model.embedded.ContactPerson;
import com.prakash.gradlegroovydemo.model.embedded.Person;
import com.prakash.gradlegroovydemo.repository.PersonTestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class PersonRepositoryTest {
    @Autowired
    PersonTestRepository repository;
    @Test
    public void savePersonTest(){
        Person person = new Person("pk",new ContactPerson("pmk",1234));
        Person person1 = repository.save(person);
        System.out.println(person1);
    }

}
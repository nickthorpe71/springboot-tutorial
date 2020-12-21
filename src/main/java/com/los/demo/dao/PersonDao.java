package com.los.demo.dao;

import com.los.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao { //DAO stands for Data Access Object

    // used for post
    int insertPerson(UUID id, Person person);
    // used for post
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    // used for get
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    // used for delete
    int deletePersonById(UUID id);

    // used for update
    int updatePersonById(UUID id, Person person);
}

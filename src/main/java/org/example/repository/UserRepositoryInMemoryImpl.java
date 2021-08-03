package org.example.repository;

import org.example.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryInMemoryImpl implements UserRepository{

    private List<User> users;

    public UserRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();
        users.add(new User("Mayly" ,"qwerty007", LocalDate.parse("1994-02-02")));
        users.add(new User("Alex" ,"fgtt777tyyh", LocalDate.parse("1980-10-16")));
        users.add(new User("Gloria" ,"kkkoko123", LocalDate.parse("2001-08-30")));
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }
}

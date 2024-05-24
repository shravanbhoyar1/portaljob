package com.example.portaljob.service;

import com.example.portaljob.entity.Users;
import com.example.portaljob.repo.UsersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
public class UserService {
@Autowired
    private UsersRepo usersRepo;
    public Users loginAndSignUp (Users users){

        return usersRepo.findById(users.getUserId())
                .orElseGet(() -> {
                    log.info("User is not present with user id {}, creating new user", users.getUserId());
                    return usersRepo.save(users);
                });
    }
}

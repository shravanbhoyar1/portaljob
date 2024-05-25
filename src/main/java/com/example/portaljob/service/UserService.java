package com.example.portaljob.service;

import com.example.portaljob.entity.Users;
import com.example.portaljob.repo.UsersRepo;
import com.example.portaljob.util.JwtUtil;
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
@Autowired
private JwtUtil jwtUtil;
    public Users loginAndSignUp (Users users){

        Users users1= usersRepo.findById(users.getUserId())
                .orElseGet(() -> {
                    log.info("User is not present with user id {}, creating new user", users.getUserId());
                    return usersRepo.save(users);
                });

        users1.setJwt(jwtUtil.generateToken(users1.getUserId().toString()));
        return users1;
    }
}

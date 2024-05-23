package com.example.portaljob.service;

import com.example.portaljob.entity.Users;
import com.example.portaljob.repo.UsersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
public class UserService {

    private UsersRepo usersRepo;
    public Users loginAndSignUp (Users users){
        if( isUserPresent(users.getUserId())){
            log.info("User is present with user id {}" , users.getUserId());
            return usersRepo.findById(users.getUserId()).get();

        }else {
            log.info("User is not present with user id " +  users.getUserId());
            return usersRepo .save(users);
        }


    }

    private boolean isUserPresent(UUID userId) {
      Users users = usersRepo.findById(userId).get();
        return Objects.isNull(users)? false:true;
    }
}

package com.example.portaljob.util;

import com.example.portaljob.entity.Users;
import com.example.portaljob.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;
@Component
public class JobUtils {
    @Autowired
    private UsersRepo usersRepo;
    public boolean isHr(UUID userId){

     Users users = usersRepo.findByuserIdAndIsHr(userId, Boolean.TRUE);
        return Objects.isNull(users)?false:true;
    }
}

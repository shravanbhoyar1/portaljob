package com.example.portaljob.repo;

import com.example.portaljob.entity.Jobs;
import com.example.portaljob.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsersRepo  extends JpaRepository<Users, UUID> {

    public Users findByuserIdAndIsHr(UUID id, boolean isHr);


}

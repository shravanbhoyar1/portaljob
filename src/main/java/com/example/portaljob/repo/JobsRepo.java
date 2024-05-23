package com.example.portaljob.repo;

import com.example.portaljob.entity.jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobsRepo extends JpaRepository<jobs, UUID> {
}
package com.example.portaljob.repo;

import com.example.portaljob.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication, UUID> {
}

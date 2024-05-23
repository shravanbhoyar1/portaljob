package com.example.portaljob.repo;

import com.example.portaljob.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InterviewRepo extends JpaRepository<Interview, UUID> {
}

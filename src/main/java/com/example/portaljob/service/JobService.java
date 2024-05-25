package com.example.portaljob.service;

import com.example.portaljob.entity.Jobs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface JobService {

    public  String  postJob(Jobs jobs, UUID userid);

    public List<Jobs> getAllActiveJobs();
}

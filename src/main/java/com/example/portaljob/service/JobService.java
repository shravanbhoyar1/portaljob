package com.example.portaljob.service;

import com.example.portaljob.entity.Jobs;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface JobService {

    public  String  postJob(Jobs jobs, UUID userid);
}

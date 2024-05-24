package com.example.portaljob.controller;

import com.example.portaljob.entity.Jobs;
import com.example.portaljob.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/postJob/{id}")
    public String postJob(@RequestBody Jobs jobs, @PathVariable("id") UUID userId){
        return    jobService.postJob(jobs,userId);
    }
}

package com.example.portaljob.service;

import com.example.portaljob.entity.Jobs;
import com.example.portaljob.repo.JobsRepo;
import com.example.portaljob.util.JobUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.lang.Boolean.TRUE;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private JobUtils jobUtils;
    @Autowired
    private JobsRepo jobsRepo;
    @Override
    public String postJob(Jobs jobs, UUID userid) {

        if(jobUtils.isHr(userid)){
            jobs.setJobId(UUID.randomUUID());
            jobsRepo.save(jobs);
            return "jobs Posted";
        }
        return "current User is not Hr";

    }

    public List<Jobs> getAllActiveJobs(){
        return jobsRepo.findByActiveAndStatus(Boolean.TRUE,"Approved");

    }
}

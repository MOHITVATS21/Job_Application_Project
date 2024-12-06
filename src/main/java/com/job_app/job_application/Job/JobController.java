package com.job_app.job_application.Job;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findJobs() {
        return jobService.findJobs();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id) {
        if(jobService.findJobById(id) != null) {
            return jobService.findJobById(id);
        }
        else{
            return new Job("job not found",0L,0L,"job not found",0L,"none");
        }

    }

}


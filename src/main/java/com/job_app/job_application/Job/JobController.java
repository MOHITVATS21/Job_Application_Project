package com.job_app.job_application.Job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findJobs() {
        return jobs;
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        jobs.add(job);
        return "job added successfully";
    }
}

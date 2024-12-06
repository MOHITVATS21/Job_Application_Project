package com.job_app.job_application.Job;


import java.util.List;

public interface JobService {
    List<Job> findJobs();
    void createJob(Job job);

    Job findJobById(Long id);
}

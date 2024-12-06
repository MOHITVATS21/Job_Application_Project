package com.job_app.job_application.Job.JobServiceImpl;

import com.job_app.job_application.Job.Job;
import com.job_app.job_application.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private Long nextid = 1L;
    @Override
    public List<Job> findJobs() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextid++);
        jobs.add(job);


    }

    @Override
    public Job findJobById(Long id) {
        for(Job job:jobs)
        {
            if(job.getId().equals(id))
            {
                return job;
            }
        }
        return null;
    }
}

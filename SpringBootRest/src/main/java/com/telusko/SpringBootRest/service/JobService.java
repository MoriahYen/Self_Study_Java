package com.telusko.SpringBootRest.service;

import com.telusko.SpringBootRest.model.JobPost;
import com.telusko.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// send data to repo layer
@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }
}



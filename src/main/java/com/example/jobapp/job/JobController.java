package com.example.jobapp.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return jobs;
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        jobs.add(job);
        return "Job added successfully";
    }
}

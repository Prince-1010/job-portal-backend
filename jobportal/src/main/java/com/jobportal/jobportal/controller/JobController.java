package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.entity.Job;
import com.jobportal.jobportal.repository.JobRepository;
import com.jobportal.jobportal.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;

    @PostMapping("{recruiterId}")
    public Job create(@RequestBody Job job,@PathVariable Long recruiterId){
        return jobService.createJob(job,recruiterId);
    }

    @GetMapping
    public List<Job> getAll(){
        return jobService.getAllJobs();
    }
}

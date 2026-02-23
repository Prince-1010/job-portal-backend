package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.entity.Application;
import com.jobportal.jobportal.repository.ApplicationRepository;
import com.jobportal.jobportal.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping("{userId}/{jobId}")
    public Application apply(@PathVariable Long userId,@PathVariable Long jobId){
        return applicationService.applyForJob(userId,jobId);
    }
}

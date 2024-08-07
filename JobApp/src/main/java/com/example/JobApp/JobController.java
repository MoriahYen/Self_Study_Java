package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }
}

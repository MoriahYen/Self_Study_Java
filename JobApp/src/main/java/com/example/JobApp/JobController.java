package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {
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
        return "success";
    }
}

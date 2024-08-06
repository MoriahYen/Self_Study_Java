package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    // Spring is responsible to assign HttpServletRequest
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
        // http://localhost:8080/add?num1=6&num2=7
        // 因為paramaters的名稱和URL中的相同，所以可以直接用
        int result = num1 + num2;

        mv.addObject("result",result);
        mv.setViewName("result");  // 否則抓不到

        return mv;
    }

    @RequestMapping("addAlien")
    // Let Spring to create this obj and then assign those two values which is coming from the browser
    public String addAlien(Alien alien) {
        return "result";
    }
}

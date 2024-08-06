package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    // Spring is responsible to assign HttpServletRequest
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        // http://localhost:8080/add?num1=6&num2=7
        // 因為paramaters的名稱和URL中的相同，所以可以直接用
        int result = num1 + num2;

        model.addAttribute("result",result);

        return "result";
    }
}

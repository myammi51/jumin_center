package com.kd.jumin_center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {
    
    @GetMapping("/login")
    public String main() {
        return "/login";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "/mypage";
    }
    
}

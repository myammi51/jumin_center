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

    @GetMapping("/mypage_sinmungo")
    public String mypage_sinmungo() {
        return "/mypage_sinmungo";
    }

    @GetMapping("/mypage_simpleDoc")
    public String mypage_simpleDoc() {
        return "/mypage_simpleDoc";
    }

    @GetMapping("/mypage_myInfoEdit")
    public String mypage_myInfoEdit() {
        return "/mypage_myInfoEdit";
    }

    @GetMapping("/signup")
    public String signup() {
        return "/signup";
    }

    @GetMapping("/findAccount")
    public String findAccount() {
        return "/findAccount";
    }
    
    
}

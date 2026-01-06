package com.example.myfirstwebsite.controller;


import com.example.myfirstwebsite.model.Users;
import com.example.myfirstwebsite.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
    @GetMapping("/")
    public String home(HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if (user != null) {
            return "home2"; // logged-in home
        }
        return "home"; // public home
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @GetMapping("IELTS")
    public String ielts(){
        return "IELTS";
    }
    @GetMapping("F1")
    public String f1(){
        return "F1";
    }
    @GetMapping("Football")
    public String football(){
        return "Football";
    }
}

package com.example.myfirstwebsite.controller;

import com.example.myfirstwebsite.model.Users;
import com.example.myfirstwebsite.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("auth/login")
    public String login(Users user, HttpSession session){
        if (userService.verify(user)){
            session.setAttribute("user", user);
            return "redirect:/";
        }
        return "redirect:/login";
    }

    @PostMapping("/auth/registration")
    public String registration(@RequestBody Users user){
        if (userService.registration(user)) return "redirect:/";
        else return "redirect:/registration";
    }
    @GetMapping("/auth/UserProfile/{id}")
    public Users getUserProfile(@PathVariable Long id){
        return userService.getUser(id);
    }
}

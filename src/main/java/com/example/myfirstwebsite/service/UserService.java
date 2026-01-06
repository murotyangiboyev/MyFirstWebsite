package com.example.myfirstwebsite.service;


import com.example.myfirstwebsite.model.Users;
import com.example.myfirstwebsite.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public boolean verify(Users users) {
        if (userRepository.findByName(users.getName()).isPresent()) {
            return true;
        }
        else  {
            return false;
        }
    }
    public boolean registration(Users users){
        if (userRepository.findByName(users.getName()).isPresent()) {
            return false;
        }
        userRepository.save(users);
        return true;
    }
}

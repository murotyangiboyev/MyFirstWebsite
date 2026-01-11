package com.example.myfirstwebsite.repository;


import com.example.myfirstwebsite.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public interface UserRepository extends CrudRepository<Users, Long> {

    Optional<Users> findByName(String username);
}

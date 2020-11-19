package pers.xzj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pers.xzj.pojo.User;
import pers.xzj.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository user;

    @GetMapping("/findById/{id}")
    public User test(@PathVariable("id") Long id){
        return user.findById(id).get();
    }

    @GetMapping("/hello")
    public String hello(){
        return "I am provider";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "I am provider by Eureka";
    }

}

package pers.xzj.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.xzj.pojo.User;
import pers.xzj.repository.UserRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository user;

    @Test
    public void test(){
        List<User> users = user.findAll();
        System.out.println(users);
    }
}

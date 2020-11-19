package pers.xzj.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import pers.xzj.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){
        final String URL = "http://127.0.0.1:9999/user.json";
        User user = restTemplate.getForObject(URL, User.class);
        System.out.println(user);
    }
}

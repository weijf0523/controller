package test;

import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wjj.ssm.web.application.model.User;
import com.wjj.ssm.web.application.service.UserManagerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class test
{
    private static Logger logger = Logger.getLogger(test.class);
    
    @Resource
    private UserManagerService userService;
    
    @Test
    public void addUserTest()
    {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setNickname("wjj");
        user.setUsername("wjj123");
        user.setPassword("123456");
        user.setQqnum("451783360");
        user.setEmail("123@123.123");
        user.setScore(999);
        user.setStatus(true);
        user.setPhonenum("13333");
        user.setLevel(1);
        userService.addUser(user);
        logger.info(JSON.toJSONString(user));

    }
}

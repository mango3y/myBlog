package cn.mango3y.myblog;

import cn.mango3y.myblog.entity.User;
import cn.mango3y.myblog.service.ProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class TestProfileService {

    @Autowired
    //@Resource
    private ProfileService profileService;

    @Test
    public void test01(){
        User user = profileService.showProfile(1);
        System.out.println(user);
    }
}

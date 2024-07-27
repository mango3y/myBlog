package cn.mango3y.myblog;

import cn.mango3y.myblog.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//测试启动:启动spring工厂，并当前测试类也会被工厂生产
@RunWith(SpringJUnit4ClassRunner.class)
//对于ContextConfiguration，它属性locations的别名为value，
// 所以也可以省略写为@ContextConfiguration("classpath:spring-context.xml")
@ContextConfiguration("classpath:spring-context.xml")
public class TestUserDAO {

    @Autowired
    //@Qualifier("userDAO")可以省略因为Autowired默认根据类型注入
    //当前测试类也会被纳入工厂中，所以其中属性可以注入
    private UserDAO userDAO;

    @Test
    public void test(){
        System.out.println(userDAO.queryUserById(1));
    }
}

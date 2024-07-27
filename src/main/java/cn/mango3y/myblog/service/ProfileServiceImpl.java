package cn.mango3y.myblog.service;

import cn.mango3y.myblog.dao.UserDAO;
import cn.mango3y.myblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("profileServiceImpl1")
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User showProfile(Integer id) {
        return userDAO.queryUserById(id);
    }
}

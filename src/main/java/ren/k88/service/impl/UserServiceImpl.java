package ren.k88.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.k88.dao.UserMapper;
import ren.k88.entity.User;
import ren.k88.service.UserService;

/**
 * Created by jasonzhu on 2017/3/13.
 */
@Service
public class UserServiceImpl implements UserService{
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser() {
        logger.info("查询第一个用户");
        return userMapper.selectByPrimaryKey(1);
    }
}

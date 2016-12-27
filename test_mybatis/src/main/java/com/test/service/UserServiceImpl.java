package com.test.service;

import com.test.dao.UserMapper;
import com.test.entity.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/25/025.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}

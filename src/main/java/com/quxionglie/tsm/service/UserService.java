
package com.quxionglie.tsm.service;

import com.quxionglie.tsm.mapper.UserMapper;
import com.quxionglie.tsm.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<UserMapper, User> {
    public User getByUsername(String username) {
            return baseMapper.getByUsername(username);
    }
}


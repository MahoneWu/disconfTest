package com.mouse.moon.service;

import com.mouse.moon.mapper.UserPersonMapper;
import com.mouse.moon.pojo.UserPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wuhao on 16/7/31.
 */
@Service
public class UserPersonServiceImpl implements UserPersonService {

    @Autowired
    private UserPersonMapper userPersonMapper;

    public UserPerson getUserPersonInfoById(String id) {
        return userPersonMapper.getUserPersonInfoById(id);
    }
}

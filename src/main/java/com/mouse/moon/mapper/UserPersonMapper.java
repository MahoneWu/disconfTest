package com.mouse.moon.mapper;

import com.mouse.moon.pojo.UserPerson;
import tk.mybatis.mapper.common.Mapper;

public interface UserPersonMapper extends Mapper<UserPerson> {
    UserPerson getUserPersonInfoById(String id);
}
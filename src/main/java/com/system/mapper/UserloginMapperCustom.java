package com.system.mapper;

import com.system.pojo.UserloginCustom;


public interface UserloginMapperCustom {

    UserloginCustom findOneByName(String name) throws Exception;

}

package com.starsea.im.aggregation.service;

import com.starsea.im.aggregation.dto.UserDto;

import java.util.List;

public interface UserService{
    public UserDto isExsit(String account,String password);

    public List<UserDto> querUsers();
}
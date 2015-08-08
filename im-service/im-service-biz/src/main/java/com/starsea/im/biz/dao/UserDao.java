package com.starsea.im.biz.dao;

import com.starsea.im.biz.entity.UserEntity;

import java.util.List;

/**
 * Created by beigua on 2015/8/5.
 */
public interface UserDao {
    public UserEntity queryUser(String acc,String pwd);

    public List<UserEntity> queryUsers();
}

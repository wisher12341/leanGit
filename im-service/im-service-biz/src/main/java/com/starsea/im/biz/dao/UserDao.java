package com.starsea.im.biz.dao;

import com.starsea.im.biz.annotation.DataSource;
import com.starsea.im.biz.annotation.Single;
import com.starsea.im.biz.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by beigua on 2015/8/5.
 */
@Repository
@Single
public interface UserDao {
    @DataSource("write")
    public UserEntity queryUser(int id);

    @DataSource("read")
    public List<UserEntity> queryUsers();
}

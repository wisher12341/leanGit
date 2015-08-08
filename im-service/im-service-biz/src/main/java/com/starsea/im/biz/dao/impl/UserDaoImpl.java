package com.starsea.im.biz.dao.impl;

import com.alibaba.druid.util.StringUtils;
import com.google.common.collect.Lists;
import com.starsea.im.biz.entity.UserEntity;
import com.starsea.im.biz.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by beigua on 2015/8/5.
 */
@Repository
public class UserDaoImpl implements UserDao{

    public UserEntity queryUser(String acc,String pwd){
        if(StringUtils.isEmpty(acc) || StringUtils.isEmpty(pwd)){
            return null;
        }

        if("zhangsan".equals(acc) && "12345".equals(pwd)){
            return new UserEntity().builder()
                    .id(1)
                    .name("张三")
                    .age(10)
                    .account("zhangsan")
                    .password("12345")
                    .email("11@qq.com")
                    .createTime(new Timestamp(System.currentTimeMillis())).build();
        }
        return null;
    }

    public List<UserEntity> queryUsers() {
        UserEntity u1 =  new UserEntity().builder()
                .id(1)
                .name("张三")
                .age(10)
                .account("zhangsan")
                .password("12345")
                .email("11@qq.com")
                .createTime(new Timestamp(System.currentTimeMillis())).build();
        UserEntity u2 =  new UserEntity().builder()
                .id(2)
                .name("李四")
                .age(10)
                .account("lisi")
                .password("12345")
                .email("12@qq.com")
                .createTime(new Timestamp(System.currentTimeMillis())).build();
        return Lists.newArrayList(u1, u2);
    }

}

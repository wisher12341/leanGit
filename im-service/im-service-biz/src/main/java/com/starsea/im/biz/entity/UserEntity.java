package com.starsea.im.biz.entity;

import lombok.*;
import lombok.experimental.Builder;

import java.sql.Timestamp;


/**
 * Created by beigua on 2015/8/5.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserEntity {
    private int id;

    private String name;

    private int age;

    private String account;

    private String password;

    private String email;

    private Timestamp createTime;
}

package com.starsea.im.aggregation.dto;


import lombok.*;
import lombok.experimental.Builder;

/**
 * Created by beigua on 2015/8/5.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserDto {
    private String name;

    private int age;

    private String account;

    private String password;

    private String email;
}

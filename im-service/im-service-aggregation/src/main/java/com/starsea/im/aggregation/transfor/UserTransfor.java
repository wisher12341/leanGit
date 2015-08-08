package com.starsea.im.aggregation.transfor;

import com.starsea.im.aggregation.dto.UserDto;
import com.starsea.im.biz.entity.UserEntity;
import org.springframework.beans.BeanUtils;

/**
 * Created by beigua on 2015/8/5.
 */
public final  class UserTransfor extends SafeFunction<UserEntity,UserDto>{
    public static final UserTransfor INSTANCE = new UserTransfor();

    private UserTransfor(){}

    @Override
    protected UserDto safeApply(UserEntity input) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(input,userDto);
        return userDto;
    }
}

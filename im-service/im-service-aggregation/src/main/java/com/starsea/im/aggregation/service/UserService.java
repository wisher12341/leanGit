package com.starsea.im.aggregation.service;

import com.starsea.im.aggregation.constant.DataSourceType;
import com.starsea.im.aggregation.dto.SearchDto;
import com.starsea.im.aggregation.dto.UserDto;
import com.starsea.im.biz.annotation.DataSource;
import com.starsea.im.biz.entity.PageModel;

import java.util.List;

/**
 * Created by beigua on 2015/8/12.
 */
public interface UserService{
    @DataSource(DataSourceType.READ)
    public UserDto isExsit(int id);

    @DataSource(DataSourceType.READ)
    public PageModel queryUsersForPage(SearchDto searchDto);

    @DataSource(DataSourceType.WRITE)
    public List<UserDto> querUsers();

    @DataSource(DataSourceType.WRITE)
    public int insert();

    @DataSource(DataSourceType.WRITE)
    public int update();

    @DataSource(DataSourceType.WRITE)
    public int delete();
}
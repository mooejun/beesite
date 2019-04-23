package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.blog.dao.entity.LoginLog;

@MyBatisDao
public interface LoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}
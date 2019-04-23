package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.User;
import me.daydayup.beesite.modules.blog.dao.entity.UserExample;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
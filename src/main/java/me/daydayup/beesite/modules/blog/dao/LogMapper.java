package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.Log;
import me.daydayup.beesite.modules.blog.dao.entity.LogExample;

public interface LogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}
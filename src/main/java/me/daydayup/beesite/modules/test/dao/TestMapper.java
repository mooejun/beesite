package me.daydayup.beesite.modules.test.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.test.dao.entity.Test;

@MyBatisDao
public interface TestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}
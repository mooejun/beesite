package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Test;
import me.daydayup.beesite.modules.blog.dao.entity.TestExample;

import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface TestMapper extends BeesiteMapper<Test> {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}
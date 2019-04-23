package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.blog.dao.entity.Tags;

@MyBatisDao
public interface TagsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}
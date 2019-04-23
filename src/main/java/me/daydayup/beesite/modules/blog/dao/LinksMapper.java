package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.blog.dao.entity.Links;

@MyBatisDao
public interface LinksMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Links record);

    int insertSelective(Links record);

    Links selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}
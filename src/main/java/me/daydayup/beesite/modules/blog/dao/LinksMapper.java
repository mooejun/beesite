package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.Links;
import me.daydayup.beesite.modules.blog.dao.entity.LinksExample;

public interface LinksMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Links record);

    int insertSelective(Links record);

    List<Links> selectByExample(LinksExample example);

    Links selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}
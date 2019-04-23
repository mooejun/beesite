package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleTags;

@MyBatisDao
public interface ArticleTagsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleTags record);

    int insertSelective(ArticleTags record);

    ArticleTags selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleTags record);

    int updateByPrimaryKey(ArticleTags record);
}
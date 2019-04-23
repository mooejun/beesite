package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleTags;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleTagsExample;

public interface ArticleTagsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleTags record);

    int insertSelective(ArticleTags record);

    List<ArticleTags> selectByExample(ArticleTagsExample example);

    ArticleTags selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleTags record);

    int updateByPrimaryKey(ArticleTags record);
}
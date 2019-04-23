package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleCategory;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleCategoryExample;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    List<ArticleCategory> selectByExample(ArticleCategoryExample example);

    ArticleCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
}
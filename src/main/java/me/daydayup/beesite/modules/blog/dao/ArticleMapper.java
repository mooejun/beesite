package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.Article;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleExample;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleWithBLOBs;

public interface ArticleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleWithBLOBs record);

    int insertSelective(ArticleWithBLOBs record);

    List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    ArticleWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record);

    int updateByPrimaryKey(Article record);
}
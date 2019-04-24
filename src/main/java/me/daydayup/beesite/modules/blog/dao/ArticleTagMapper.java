package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Article;
import me.daydayup.beesite.modules.blog.dao.entity.ArticleTags;
import me.daydayup.beesite.modules.blog.dao.entity.Tags;

import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface ArticleTagMapper extends BeesiteMapper<ArticleTags> {

    List<Tags> findByArticleId(long articleId);

    List<Article> findByTagName(String name);

}
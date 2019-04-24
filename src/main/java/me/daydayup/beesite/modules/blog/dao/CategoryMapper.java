package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Category;

import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface CategoryMapper extends BeesiteMapper<Category> {
    List<Category> findCategoryByArticleId(long id);
}
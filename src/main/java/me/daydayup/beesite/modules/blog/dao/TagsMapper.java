package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Tags;

import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface TagsMapper extends BeesiteMapper<Tags> {

    List<Tags> findByArticleId(long id);
}
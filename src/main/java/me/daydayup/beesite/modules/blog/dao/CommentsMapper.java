package me.daydayup.beesite.modules.blog.dao;

import com.github.pagehelper.Page;
import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Comments;
import org.apache.ibatis.annotations.Param;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface CommentsMapper extends BeesiteMapper<Comments> {

    /**
     * 分页查询指定文章的评论数据
     *
     * @param articleId
     * @param sort
     * @return
     */
    Page<Comments> findCommentsList(@Param("articleId") int articleId, @Param("sort") int sort);

    /**
     * 查询所有评论数据，用于从中筛选实现分页
     *
     * @param articleId
     * @param sort
     * @return
     */
    Page<Comments> findAllId(@Param("articleId") int articleId, @Param("sort") int sort);
}
package me.daydayup.beesite.modules.blog.dao;

import com.github.pagehelper.Page;
import me.daydayup.beesite.common.persistence.BeesiteMapper;
import me.daydayup.beesite.modules.blog.dao.entity.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface ArticleMapper extends BeesiteMapper<ArticleMapper> {

    @Select("select * from tb_article where state = '1' order by id desc")
    Page<Article> findByPageForSite();

    @Select("SELECT id FROM tb_article ORDER BY id DESC LIMIT 1")
    long getLastId();

    @Select("SELECT DISTINCT DATE_FORMAT(publish_time, '%Y-%m') FROM tb_article ORDER BY DATE_FORMAT(publish_time, '%Y-%m') DESC")
    List<String> findArchivesDates();

    @Select("SELECT id, title, publish_time FROM tb_article WHERE publish_time LIKE CONCAT ('%', #{date} ,'%')")
    List<Article> findArchivesByDate(String date);

    @Select("SELECT * FROM tb_article WHERE title LIKE CONCAT('%', #{title}, '%')")
    List<Article> findFuzzyByTitle(String title);

    @Select("update tb_article set views = (views + 1) where id = #{id}")
    void addViews(long id);
}
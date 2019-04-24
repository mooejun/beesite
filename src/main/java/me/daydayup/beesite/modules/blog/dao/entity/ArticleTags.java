package me.daydayup.beesite.modules.blog.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author mooejun
 * @date 2019/4/24
 */
@Data
@Table(name = "tb_article_tags")
public class ArticleTags implements Serializable {

    @Id
    private Long id;
    @NotNull
    @Column(name = "article_id")
    private Long articleId;
    @NotNull
    @Column(name = "tag_id")
    private Long tagId;

    public ArticleTags() {
    }

    public ArticleTags(Long articleId, Long tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}

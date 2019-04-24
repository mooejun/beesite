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
@Table(name = "tb_article_category")
public class ArticleCategory implements Serializable {

    @Id
    private Long id;
    @NotNull
    @Column(name = "article_id")
    private Long articleId;
    @NotNull
    @Column(name = "category_id")
    private Long categoryId;

    public ArticleCategory() {
    }

    public ArticleCategory(Long articleId, Long categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}

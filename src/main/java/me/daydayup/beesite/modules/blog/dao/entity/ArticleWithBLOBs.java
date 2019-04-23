package me.daydayup.beesite.modules.blog.dao.entity;

public class ArticleWithBLOBs extends Article {
    private String content;

    private String contentMd;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContentMd() {
        return contentMd;
    }

    public void setContentMd(String contentMd) {
        this.contentMd = contentMd == null ? null : contentMd.trim();
    }
}
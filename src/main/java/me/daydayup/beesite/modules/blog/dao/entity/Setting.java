package me.daydayup.beesite.modules.blog.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author mooejun
 * @date 2019/4/24
 */
@Data
@Table(name = "tb_setting")
public class Setting implements Serializable {

    @Id
    private Long id;
    @Column(name = "site_name")
    private String siteName;
    @Column(name = "site_links")
    private Object siteLinks;
    @Column(name = "site_donation")
    private Object siteDonation;
    @Column(name = "site_music")
    private String siteMusic;
    private String about;
    @Column(name = "about_md")
    private String aboutMd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Object getSiteLinks() {
        return siteLinks;
    }

    public void setSiteLinks(Object siteLinks) {
        this.siteLinks = siteLinks;
    }

    public Object getSiteDonation() {
        return siteDonation;
    }

    public void setSiteDonation(Object siteDonation) {
        this.siteDonation = siteDonation;
    }

    public String getSiteMusic() {
        return siteMusic;
    }

    public void setSiteMusic(String siteMusic) {
        this.siteMusic = siteMusic;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAboutMd() {
        return aboutMd;
    }

    public void setAboutMd(String aboutMd) {
        this.aboutMd = aboutMd;
    }
}

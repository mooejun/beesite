package me.daydayup.beesite.modules.blog.dao.entity;

public class Setting {
    private Integer id;

    private String siteName;

    private String siteDonation;

    private String siteMusic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteDonation() {
        return siteDonation;
    }

    public void setSiteDonation(String siteDonation) {
        this.siteDonation = siteDonation == null ? null : siteDonation.trim();
    }

    public String getSiteMusic() {
        return siteMusic;
    }

    public void setSiteMusic(String siteMusic) {
        this.siteMusic = siteMusic == null ? null : siteMusic.trim();
    }
}
package me.daydayup.beesite.modules.blog.dao.entity;

public class SettingWithBLOBs extends Setting {
    private String siteLinks;

    private String about;

    private String aboutMd;

    public String getSiteLinks() {
        return siteLinks;
    }

    public void setSiteLinks(String siteLinks) {
        this.siteLinks = siteLinks == null ? null : siteLinks.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getAboutMd() {
        return aboutMd;
    }

    public void setAboutMd(String aboutMd) {
        this.aboutMd = aboutMd == null ? null : aboutMd.trim();
    }
}
package me.daydayup.beesite.modules.test.dto;

/**
 * @author mooejun
 * @since 2019/4/21
 */
public class TestDto {
    private String userId;

    private String userName;

    private String sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

package me.daydayup.beesite.modules.blog.service;

import me.daydayup.beesite.modules.blog.model.vo.UserVo;

/**
 * @author mooejun
 * @since 2019/4/28
 */
public interface IUserService {

    /**
     * 保存用户数据
     *
     * @param userVo 用户数据
     * @return 主键
     */

    Integer insertUser(UserVo userVo);

    /**
     * 通过uid查找对象
     *
     * @param uid
     */
    UserVo queryUserById(Integer uid);

    /**
     * 用戶登录
     *
     * @param username
     * @param password
     */
    UserVo login(String username, String password);

    /**
     * 根据主键更新user对象
     *
     * @param userVo
     */
    void updateByUid(UserVo userVo);
}

package me.daydayup.beesite.modules.blog.dao;

import me.daydayup.beesite.common.persistence.annotation.MyBatisDao;
import me.daydayup.beesite.modules.blog.dao.entity.Setting;
import me.daydayup.beesite.modules.blog.dao.entity.SettingWithBLOBs;

@MyBatisDao
public interface SettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SettingWithBLOBs record);

    int insertSelective(SettingWithBLOBs record);

    SettingWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SettingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SettingWithBLOBs record);

    int updateByPrimaryKey(Setting record);
}
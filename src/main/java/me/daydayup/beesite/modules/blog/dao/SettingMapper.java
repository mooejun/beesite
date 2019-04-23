package me.daydayup.beesite.modules.blog.dao;

import java.util.List;
import me.daydayup.beesite.modules.blog.dao.entity.Setting;
import me.daydayup.beesite.modules.blog.dao.entity.SettingExample;
import me.daydayup.beesite.modules.blog.dao.entity.SettingWithBLOBs;

public interface SettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SettingWithBLOBs record);

    int insertSelective(SettingWithBLOBs record);

    List<SettingWithBLOBs> selectByExampleWithBLOBs(SettingExample example);

    List<Setting> selectByExample(SettingExample example);

    SettingWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SettingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SettingWithBLOBs record);

    int updateByPrimaryKey(Setting record);
}
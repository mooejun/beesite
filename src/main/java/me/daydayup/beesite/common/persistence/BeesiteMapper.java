package me.daydayup.beesite.common.persistence;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author mooejun
 * @since 2019/4/24
 */
public interface BeesiteMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

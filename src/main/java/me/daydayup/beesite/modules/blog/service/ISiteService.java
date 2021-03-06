package me.daydayup.beesite.modules.blog.service;

import me.daydayup.beesite.modules.blog.dto.MetaDto;
import me.daydayup.beesite.modules.blog.model.bo.ArchiveBo;
import me.daydayup.beesite.modules.blog.model.bo.BackResponseBo;
import me.daydayup.beesite.modules.blog.model.bo.StatisticsBo;
import me.daydayup.beesite.modules.blog.model.vo.CommentVo;
import me.daydayup.beesite.modules.blog.model.vo.ContentVo;

import java.util.List;

/**
 * 站点服务
 *
 * @author mooejun
 * @since 2019/4/28
 */
public interface ISiteService {


    /**
     * 最新收到的评论
     *
     * @param limit
     */
    List<CommentVo> recentComments(int limit);

    /**
     * 最新发表的文章
     *
     * @param limit
     */
    List<ContentVo> recentContents(int limit);

    /**
     * 查询一条评论
     *
     * @param coid
     */
    CommentVo getComment(Integer coid);

    /**
     * 系统备份
     *
     * @param bk_type
     * @param bk_path
     * @param fmt
     */
    BackResponseBo backup(String bk_type, String bk_path, String fmt) throws Exception;


    /**
     * 获取后台统计数据
     */
    StatisticsBo getStatistics();

    /**
     * 查询文章归档
     */
    List<ArchiveBo> getArchives();

    /**
     * 获取分类/标签列表
     */
    List<MetaDto> metas(String type, String orderBy, int limit);

}

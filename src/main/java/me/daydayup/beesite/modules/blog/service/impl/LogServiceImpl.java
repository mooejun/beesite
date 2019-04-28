package me.daydayup.beesite.modules.blog.service.impl;

import com.github.pagehelper.PageHelper;
import me.daydayup.beesite.modules.blog.dao.LogVoMapper;
import me.daydayup.beesite.modules.blog.service.ILogService;
import me.daydayup.beesite.modules.blog.utils.DateKit;
import me.daydayup.beesite.modules.blog.constant.WebConst;
import me.daydayup.beesite.modules.blog.model.vo.LogVo;
import me.daydayup.beesite.modules.blog.model.vo.LogVoExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mooejun
 * @since 2019/4/28
 */
@Service
public class LogServiceImpl implements ILogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogServiceImpl.class);

    @Resource
    private LogVoMapper logDao;

    @Override
    public void insertLog(LogVo logVo) {
        logDao.insert(logVo);
    }

    @Override
    public void insertLog(String action, String data, String ip, Integer authorId) {
        LogVo logs = new LogVo();
        logs.setAction(action);
        logs.setData(data);
        logs.setIp(ip);
        logs.setAuthorId(authorId);
        logs.setCreated(DateKit.getCurrentUnixTime());
        logDao.insert(logs);
    }

    @Override
    public List<LogVo> getLogs(int page, int limit) {
        LOGGER.debug("Enter getLogs method:page={},linit={}",page,limit);
        if (page <= 0) {
            page = 1;
        }
        if (limit < 1 || limit > WebConst.MAX_POSTS) {
            limit = 10;
        }
        LogVoExample logVoExample = new LogVoExample();
        logVoExample.setOrderByClause("id desc");
        PageHelper.startPage((page - 1) * limit, limit);
        List<LogVo> logVos = logDao.selectByExample(logVoExample);
        LOGGER.debug("Exit getLogs method");
        return logVos;
    }
}

package me.daydayup.beesite.modules.test.service;

import me.daydayup.beesite.common.service.BaseService;
import me.daydayup.beesite.modules.test.dao.TestMapper;
import me.daydayup.beesite.modules.test.dao.entity.Test;
import me.daydayup.beesite.modules.test.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试Service
 *
 * @author mooejun
 * @since 2019/4/21
 */
@Service
@Transactional(readOnly = true)
//public class TestService extends BaseService {
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public TestDto getDto(String id) {
        Test aTest = this.testMapper.selectByPrimaryKey(id);
        TestDto aTestDto = new TestDto();
        aTestDto.setUserId(aTest.getUserId());
        aTestDto.setUserName(aTest.getUserName());
        aTestDto.setSex(aTest.getSex());
        return aTestDto;
    }
}

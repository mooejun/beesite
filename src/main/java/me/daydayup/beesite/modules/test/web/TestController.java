package me.daydayup.beesite.modules.test.web;

import me.daydayup.beesite.common.web.BaseController;
import me.daydayup.beesite.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller
 *
 * @author mooejun
 * @since 2019/4/21
 */
@Controller
@RequestMapping(value = "/test")
public class TestController extends BaseController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test001")
    @ResponseBody
    public String get(@RequestParam(required = false) String id) {
        logger.info("id=" + id);
        if (StringUtils.hasText(id)) {
            return testService.getDto(id).getUserName();
        } else {
            return "";
        }
    }

}
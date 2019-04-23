package me.daydayup.beesite.modules.blog.web;

import me.daydayup.beesite.common.web.BaseController;
import me.daydayup.beesite.modules.test.dto.TestDto;
import me.daydayup.beesite.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller
 *
 * @author mooejun
 * @since 2019/4/21
 */
@Controller
@RequestMapping(value = "/blog/article")
public class ArticleController extends BaseController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "find", produces = "text/xml;charset=utf-8")
    @ResponseBody
    public String get() {
        TestDto testDto = testService.getDto("0");
        return testDto.getUserName();
    }

}

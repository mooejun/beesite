package me.daydayup.beesite.modules.blog.interceptor;

import me.daydayup.beesite.modules.blog.model.vo.OptionVo;
import me.daydayup.beesite.modules.blog.model.vo.UserVo;
import me.daydayup.beesite.modules.blog.service.IOptionService;
import me.daydayup.beesite.modules.blog.service.IUserService;
import me.daydayup.beesite.modules.blog.constant.WebConst;
import me.daydayup.beesite.modules.blog.dto.Types;
import me.daydayup.beesite.modules.blog.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * @author mooejun
 * @since 2019/4/28
 */
@Component
public class BaseInterceptor implements HandlerInterceptor {
    private static final Logger LOGGE = LoggerFactory.getLogger(BaseInterceptor.class);
    private static final String USER_AGENT = "user-agent";

    @Resource
    private IUserService userService;

    @Resource
    private IOptionService optionService;

    private MapCache cache = MapCache.single();

    @Resource
    private Commons commons;

    @Resource
    private AdminCommons adminCommons;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String contextPath = request.getContextPath();
        // System.out.println(contextPath);
        String uri = request.getRequestURI();

        LOGGE.info("UserAgent: {}", request.getHeader(USER_AGENT));
        LOGGE.info("用户访问地址: {}, 来路地址: {}", uri, IPKit.getIpAddrByRequest(request));


        //请求拦截处理
        UserVo user = TaleUtils.getLoginUser(request);
        if (null == user) {
            Integer uid = TaleUtils.getCookieUid(request);
            if (null != uid) {
                //这里还是有安全隐患,cookie是可以伪造的
                user = userService.queryUserById(uid);
                request.getSession().setAttribute(WebConst.LOGIN_SESSION_KEY, user);
            }
        }
        if (uri.startsWith(contextPath + "/admin") && !uri.startsWith(contextPath + "/admin/login") && null == user) {
            response.sendRedirect(request.getContextPath() + "/admin/login");
            return false;
        }
        //设置get请求的token
        if (request.getMethod().equals("GET")) {
            String csrf_token = UUID.UU64();
            // 默认存储30分钟
            cache.hset(Types.CSRF_TOKEN.getType(), csrf_token, uri, 30 * 60);
            request.setAttribute("_csrf_token", csrf_token);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        OptionVo ov = optionService.getOptionByName("site_record");
        httpServletRequest.setAttribute("commons", commons);//一些工具类和公共方法
        httpServletRequest.setAttribute("option", ov);
        httpServletRequest.setAttribute("adminCommons", adminCommons);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

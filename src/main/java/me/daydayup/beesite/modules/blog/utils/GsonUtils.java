package me.daydayup.beesite.modules.blog.utils;

import com.google.gson.Gson;

/**
 * @author mooejun
 * @since 2019/4/28
 */
public class GsonUtils {

    private static final Gson gson = new Gson();

    public static String toJsonString(Object object){
      return object==null?null:gson.toJson(object);
    }
}

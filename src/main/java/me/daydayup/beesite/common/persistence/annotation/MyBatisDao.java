package me.daydayup.beesite.common.persistence.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author mooejun
 * @since 2019/4/21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
    String value() default "";
}
package me.daydayup.beesite.modules.blog.dto;

import me.daydayup.beesite.modules.blog.model.vo.MetaVo;

/**
 * @author mooejun
 * @since 2019/4/28
 */
public class MetaDto extends MetaVo {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

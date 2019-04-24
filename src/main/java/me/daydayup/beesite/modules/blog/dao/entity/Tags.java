package me.daydayup.beesite.modules.blog.dao.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author mooejun
 * @date 2019/4/24
 */
@Data
@Table(name = "tb_tags")
public class Tags implements Serializable {

    @Id
    private Long id;
    @NotNull
    private String name;

    @Transient
    private Long count;

    public Tags() {
    }

    public Tags(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}

package me.daydayup.beesite.modules.blog.dao.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author mooejun
 * @date 2019/4/24
 */
@Data
@Table(name = "tb_category")
public class Category implements Serializable {

    @Id
    private Long id;
    @NotNull
    private String name;

    public Category() {
    }

    public Category(String name) {
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
}

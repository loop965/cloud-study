package com.loop.common.entiy;

import lombok.Data;

/**
 * @author: yf
 * @date: 2021/11/17  16:20
 * @desc:
 */
@Data
public class User {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

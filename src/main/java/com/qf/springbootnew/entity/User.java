package com.qf.springbootnew.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

public class User {
    //指定格式不返回
    @JsonIgnore
    private Long id;

    //空字段不返回
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "用户名不能为空")
    private String name;

    private Date entryDate;

    public User(Long id, String name, Date entryDate) {
        this.id = id;
        this.name = name;
        this.entryDate = entryDate;
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

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}

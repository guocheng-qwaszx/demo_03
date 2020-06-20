package com.example.demo.entity;

import lombok.Data;

import java.util.List;


public class UserVo {

    private Integer current;
    private Integer size;
    private Long total;
    private List<User> userList;

    public Integer getCurrent() {
        return current;
    }

    public Integer getSize() {
        return size;
    }

    public Long getTotal() {
        return total;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "current=" + current +
                ", size=" + size +
                ", total=" + total +
                ", userList=" + userList +
                '}';
    }
}

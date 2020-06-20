package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import lombok.Data;

import java.time.LocalDateTime;


@TableName("user")
public class User {

    @TableId("id")
    private int id;

    @TableField("account")
    private String account;

    private String password;

    private String name;

    private String phone;

    @TableField("idcard")
    private String id_card;

    private String email;

    private String addr;

    private String nickname;

    private LocalDateTime time;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id_card='" + id_card + '\'' +
                ", email='" + email + '\'' +
                ", addr='" + addr + '\'' +
                ", nickname='" + nickname + '\'' +
                ", time=" + time +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getId_card() {
        return id_card;
    }

    public String getEmail() {
        return email;
    }

    public String getAddr() {
        return addr;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

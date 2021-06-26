package com.example.plus.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makempy
 * @since 2021-06-26 14:10:45
 */
public class User implements Serializable {
    private static final long serialVersionUID = -49977302215553157L;

    private Integer userid;

    private String username;

    private String usertel;

    private String usersex;

    private String password;

    private String salt;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}

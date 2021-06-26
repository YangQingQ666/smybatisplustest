package com.example.plus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.plus.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    public IPage<User> selectUserPage(Integer page,Integer size);
    List<User> queryAll();
}

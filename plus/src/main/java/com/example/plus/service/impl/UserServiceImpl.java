package com.example.plus.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.plus.mapper.UserDao;
import com.example.plus.entity.User;
import com.example.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public IPage<User> selectUserPage(Integer page,Integer size) {
        Page<User> userPage=new Page<>(page,size);
        return baseMapper.selectPage(userPage,null);
    }

    @Override
    public List<User> queryAll() {
        return this.userDao.queryAll();
    }
}

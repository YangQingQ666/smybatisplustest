package com.example.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.plus.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makempy
 * @since 2021-06-26 14:10:46
 */
@Repository
public interface UserDao extends BaseMapper<User> {
    List<User> queryAll();
}


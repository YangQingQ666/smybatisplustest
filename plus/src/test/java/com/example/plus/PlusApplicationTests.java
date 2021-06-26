package com.example.plus;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.plus.mapper.UserDao;
import com.example.plus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlusApplicationTests {
    @Autowired
    private UserDao userService;

    @Test
    void contextLoads() {
        Page<User> page=new Page<>(1,1);
        IPage<User> userIPage = this.userService.selectPage(page,null);
        System.out.println(JSONObject.toJSONString(userIPage));
    }

}

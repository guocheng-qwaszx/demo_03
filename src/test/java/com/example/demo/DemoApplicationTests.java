package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.config.LogConfig;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Lang;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.management.Query;
import java.time.LocalDateTime;
import java.util.*;


@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {


    @Resource
    private UserMapper userMapper;

    @Test
    public void select() {
       List<User> list = userMapper.selectList(null);
       Assert.assertEquals(100,list.size());
       list.forEach(System.out::println);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setAccount("guocheng106");
        user.setPassword("a6c326d116322eae02d6ab7542009cbc");
        user.setName("陈英");
        user.setPhone("13936744262");
        user.setId_card("610575183468830608");
        user.setEmail("635235686@qq.com");
        user.setAddr("西安市长安区");
        user.setNickname("fodkgfd");
        user.setTime(LocalDateTime.now());
        int row = userMapper.insert(user);
    System.out.println("影响记录数：" + row);
    }

    @Test
    public void selectByIds() {
        List<Integer> idList = Arrays.asList(11,12,13,14,15,16);
        List<User> userList = userMapper.selectBatchIds(idList);
        userList.forEach(System.out::println);
    }

    @Test
    public void selectByMap() {
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("name","陈英");
        userMap.put("phone","13936744262");
        List<User> userList = userMapper.selectByMap(userMap);
        userList.forEach(System.out::println);

    }

    @Test
    public void selectByWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.between("id",40,50).orderByDesc("id");
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void queryUserForPage(){
        Page<User> userPage = new Page<>(2, 10);
        IPage<User> iUserPage = userMapper.selectPage(userPage, null);
        List<User> list = iUserPage.getRecords();
        for(User user : list){
            System.out.println(user);
        }
    }
    @Test
    public void get_Log() {
        final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

        LOG.trace("-----trace");
        LOG.debug("-----debug");
        LOG.info("-----info");
        LOG.warn("-----warn");
        LOG.error("-----error");
    }


}

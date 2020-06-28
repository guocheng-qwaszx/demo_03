package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.UserVo;
import io.swagger.annotations.Api;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "分页")
@RestController
@RequestMapping("/hello")
public class helloController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public Result<UserVo> queryList(Integer current, Integer size) {
        /**
         * 这些代码应该写在service层
         */
        UserVo userVo = new UserVo();
        IPage<User> page = new Page<>(current, size);
        userMapper.selectPage(page, null);
        userVo.setCurrent(current);
        userVo.setSize(size);
        userVo.setTotal(page.getTotal());
        userVo.setUserList(page.getRecords());
        return ResultGenerator.makeOKRsp(userVo);
    }

    @GetMapping("/q1")
    public String get1() {
        return "hello1";
    }

    @GetMapping("/q2")
    public String get2() {
        return "hello1";
    }

    @GetMapping("/q3")
    public String get3() {
        String currentUser = "";
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("----------"+principl);
        if(principl instanceof UserDetails) {
            currentUser = ((UserDetails)principl).getUsername();
        }else {
            currentUser = principl.toString();
        }
        return " some product info,currentUser is: "+currentUser;
    }
}

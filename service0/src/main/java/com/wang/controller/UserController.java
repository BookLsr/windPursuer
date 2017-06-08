package com.wang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 用户Controller
 * @Author windpursuer
 * @Date 2017/6/7 16:11
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * Description 测试返回
     * @Author windpursuer
     * @Date 2017/6/7 16:17
     */
    @ResponseBody
    @RequestMapping("list")
    public Map<String, String> list() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "hy");
        map.put("age", "12");
        return map;
    }
}

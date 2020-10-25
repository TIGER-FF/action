package com.tiger.springboot.action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tigerff
 * @version 1.0
 * @date 2020/10/25 17:17
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String getHello()
    {
        return "小子你成功了";
    }
}

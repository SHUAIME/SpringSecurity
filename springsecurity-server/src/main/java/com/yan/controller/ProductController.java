package com.yan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yan
 * @Date: 2020/4/18 10:56
 * @Description: com.yan.controller
 * @version: 1.0
 */
@RestController
public class ProductController {

    @GetMapping("/product/findAll")
    public String index(){
        return "O(∩_∩)O哈哈~";
    }
}

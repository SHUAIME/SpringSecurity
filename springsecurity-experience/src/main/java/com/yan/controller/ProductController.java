package com.yan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yan
 * @Date: 2020/4/18 10:56
 * @Description: com.yan.controller
 * @version: 1.0
 */
@Controller
public class ProductController {

    @GetMapping("/product/findAll")
    public String index(){
        return "product-list";
    }
}

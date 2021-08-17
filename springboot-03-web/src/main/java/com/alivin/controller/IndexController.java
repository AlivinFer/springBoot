package com.alivin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 在 templates 目录下的所有页面，只能通过 Controller 来跳转
// 需要导入模板引擎支持  thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "Hello SpringBoot");
        return "test";
    }
}

package com.example.thymeleaftests;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {

    @RequestMapping("/test2")
    public String test2(ModelMap model) {

        return "test2";
    }
}

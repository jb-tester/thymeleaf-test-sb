package com.example.thymeleaftests;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Test1Controller {

    @RequestMapping("/test1")
    public String test1(ModelMap model) {

        Map<String,String> myMap = new HashMap<>();
        List<String> myList = new ArrayList<>();
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
        myList.add("element4");
        myList.add("element5");
        myMap.put("key1","value1");
        myMap.put("key2","value2");
        myMap.put("key3","value3");
        myMap.put("key4","value4");
        myMap.put("key5","value5");
        model.addAttribute("map_var1",myMap);
        model.addAttribute("list_var1",myList);
        model.addAttribute("str_var1","string_var1_value");
        model.addAttribute("str_var2","string_var2_value");
        model.addAttribute("bool_var1",true);
        model.addAttribute("nullable_var",null);
        model.addAttribute("int_var1",10);
        model.addAttribute("int_var2",20);
        model.addAttribute("myBean1",new MyBean1(false,"mb1",100));
        return "test1";
    }
}

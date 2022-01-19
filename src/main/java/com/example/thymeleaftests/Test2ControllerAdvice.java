package com.example.thymeleaftests;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *
 * <p>Created by irina on 1/19/2022.</p>
 * <p>Project: thymeleaf-test-sb</p>
 * *
 */
@ControllerAdvice(assignableTypes = Test2Controller.class)
public class Test2ControllerAdvice {

    @ModelAttribute(name = "dummy1")
    public DummyBean dummy1(){
        List<String> strList = new ArrayList<>();
        strList.add("strlist_el1");
        strList.add("strlist_el2");
        FooBean fooBean = new FooBean("fooBean_str");
        List<FooBean> fooList = new ArrayList<>();
        fooList.add(new FooBean("fooB1"));
        fooList.add(new FooBean("fooB2"));
        return new DummyBean("dummy1_str", strList, fooBean, fooList);
    }
}

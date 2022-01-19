package com.example.thymeleaftests;

import java.util.List;


public class DummyBean {

    String str1;
    List<String> strList1;
    FooBean fooBean1;

    public DummyBean(String str1, List<String> strList1, FooBean fooBean1, List<FooBean> fooBeanList1) {
        this.str1 = str1;
        this.strList1 = strList1;
        this.fooBean1 = fooBean1;
        this.fooBeanList1 = fooBeanList1;
    }

    List<FooBean> fooBeanList1;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public List<String> getStrList1() {
        return strList1;
    }

    public void setStrList1(List<String> strList1) {
        this.strList1 = strList1;
    }

    public FooBean getFooBean1() {
        return fooBean1;
    }

    public void setFooBean1(FooBean fooBean1) {
        this.fooBean1 = fooBean1;
    }

    public List<FooBean> getFooBeanList1() {
        return fooBeanList1;
    }

    public void setFooBeanList1(List<FooBean> fooBeanList1) {
        this.fooBeanList1 = fooBeanList1;
    }

    public static class InnerDummy{
        String str2;
        List<String> strList2;
        FooBean fooBean2;
        List<FooBean> fooBeanList2;

        public String getStr2() {
            return str2;
        }

        public void setStr2(String str2) {
            this.str2 = str2;
        }

        public List<String> getStrList2() {
            return strList2;
        }

        public void setStrList2(List<String> strList2) {
            this.strList2 = strList2;
        }

        public FooBean getFooBean2() {
            return fooBean2;
        }

        public void setFooBean2(FooBean fooBean2) {
            this.fooBean2 = fooBean2;
        }

        public List<FooBean> getFooBeanList2() {
            return fooBeanList2;
        }

        public void setFooBeanList2(List<FooBean> fooBeanList2) {
            this.fooBeanList2 = fooBeanList2;
        }
    }
}

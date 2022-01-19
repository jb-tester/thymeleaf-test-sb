package com.example.thymeleaftests;


public class MyBean1 {
    public static String FOO ="foo";
    public static String fooStaticMethod(String sArg){
        return "bar "+sArg;
    }

    boolean flag;
    String str;
    int num;

    public MyBean1(boolean flagArg, String strArg, int numArg) {
        flag = flagArg;
        str = strArg;
        num = numArg;


    }

    public boolean testStr(String arg){
        return arg.endsWith("s");
    }
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flagArg) {
        flag = flagArg;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String strArg) {
        str = strArg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int numArg) {
        num = numArg;
    }


}

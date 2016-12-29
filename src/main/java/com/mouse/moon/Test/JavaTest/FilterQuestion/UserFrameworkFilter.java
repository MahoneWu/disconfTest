package com.mouse.moon.Test.JavaTest.FilterQuestion;

/**
 * Created by Mahone Wu on 2016/7/20.
 */
public class UserFrameworkFilter implements  UserFilter {

    public void printf(String name){
        System.out.println("进入");
        testDeal();
    }

    public void testDeal(){
        System.out.println("调用父类方法");
    }

    public void test3(){
        System.out.println("test3");
    }
}

package com.example;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class TestBeanUtils {


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        A a1=new A("a1_aaa","a1_bbb");
        A a2=new A("a2_ccc");
        BeanUtils.copyProperties(a2,a1);
        System.out.println("fasf");
    }


}

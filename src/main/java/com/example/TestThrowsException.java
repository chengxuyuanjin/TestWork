package com.example;

/**
 * @author: zhanghuijin
 * @date: 2023/06/05/12:03
 * @Description:
 */
public class TestThrowsException {
    public static void main(String[] args) throws Exception {
//        test1();
//        test2();
        test3();
//        test4();
    }
    public static void test1() throws Exception {
        throw new Exception("参数越界");
//        System.out.println("异常后"); //编译错误，「无法访问的语句」
    }

    public static void test2() throws Exception {
        try {
            throw new Exception("参数越界");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("异常后"); // 可以执行
    }

    public static void test3() throws Exception {
        if (true) {
            throw new Exception("参数越界");
        }
        System.out.println("异常后"); //抛出异常，但不会执行
    }

    public static void test4() throws Exception {
        try{
            throw new Exception("参数越界");

        }catch (Exception e){
            System.out.println("catch");
            return;
        }

//        System.out.println("异常后"); // 编译错误，「无法访问的语句」
    }



}

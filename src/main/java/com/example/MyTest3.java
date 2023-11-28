package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhanghuijin
 * @date: 2023/06/19/21:58
 * @Description:
 */
public class MyTest3 {

    private static final Map<Integer,Integer> map=new HashMap<>();

    public static int fun(int n){
        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        return fun(n-1)+fun(n-2);
    }

    public static int fun2(int n){
        if (map.get(n)!=null){
            return map.get(n);
        }

        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        int result=fun(n-1)+fun(n-2);
        map.put(n,result);

        return result;
    }

    public static int fun3(int n){
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;

        for (int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }

        return a[n];
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("递归求解：fun(40)="+fun(40));
        System.out.println("递归缓存求解：fun(40)="+fun2(40));
        System.out.println("动态规划求解：fun3(40)="+fun3(40));

        String clearTime ="2023-06-27 16:36:46";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date clearDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(clearTime);
        System.out.println(sdf.format(clearDateTime));
    }
}

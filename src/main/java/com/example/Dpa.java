package com.example;

/**
 * @author: zhanghuijin
 * @date: 2023/06/19/21:19
 * @Description:
 */
public class Dpa {
    public static int output[] = new int[1000];//暂存区
    public static void main(String[] args) {
        System.out.println(f(4));

    }
    public static int fib(int n){
        int result;
        result=output[n];
        if(result==0){
            if(n==0) return 0;
            if(n==1)
                return 1;
            else{
                return (fib(n-1)+fib(n-2));
            }
        }
        output[n]=result;
        return result;
    }
    public static int f(int n) {
        if(n==0) {
            return 0;//初始值为0
        }
        if(n==1) {
            return 1;//定义f（1）为1，否者结果都是0；
        }
        int result=0;
        int r1 = 0;
        int r2 = 1;
        for(int i = 2;i<=n; i++) {//斐波那契数列求解f（n）
            result = r1+r2;
            r1=r2;
            r2=result;
        }
        return result;//返回结果
    }

}

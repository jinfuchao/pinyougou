package com.itheima03.digui;
/*
    递归求 阶乘  n的阶乘 n>=1
        n! = n*(n-1)*(n-2)*...*3*2*1
        (n-1)! = (n-1)*(n-2)*...*3*2*1
        ...
        5! = 5*4*3*2*1         5*4!
        4! = 4*3*2*1           4*3!
        3! = 3*2*1             3*2!
        2! = 2*1               2*1!
        1! = 1                  1

      推断 发现了规律
      n! = n*(n-1)!

 */
public class Demo02Digui {
    public static void main(String[] args) {
        //求 n的阶乘
        int n = 5;
        int jc = jc(n);
        System.out.println(n+"的阶乘是:"+jc);
    }

    /*
        求阶乘方法
     */
    private static int jc(int n) {
        if(n == 1){//递归的出口
            return 1;
        }
        return n*jc(n-1);
    }



}

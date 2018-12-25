package com.itheima01.file;

import java.io.File;

/*

    理解一下概念
        绝对路径 从盘符开始算起的路径

        相对路径 在一个项目中 相对于当前项目的路径(参照物 --> 项目)

        public String getAbsoutePath() 获取 file对象的 绝对路径
                就是 从盘符开始算的一个 路径字符串
        public String getPath() 这个方法 获取的是 file对象的 封装路径
 */
public class Demo03File {

    public static void main(String[] args) {
        //使用绝对路径 封装 D:\\javaee\\你好.txt File对象
        File file = new File("D:\\javaee\\你好.txt");

        System.out.println("file的绝对路径:" + file.getAbsolutePath());
        System.out.println("file的封装路径:" + file.getPath());

        //当前项目的路径是 D:\\javaee
        //使用 相对路径 封装 对象
        File file2 = new File("你好.txt");
        System.out.println("file2的绝对路径:" + file2.getAbsolutePath());
        System.out.println("file2的封装路径:" + file2.getPath());

    }
}

package com.itheima01.file;

import java.io.File;

/*
   文件的名称 是包括后缀的
        文件 可以没有后缀
        文件夹 的 名称 可以有.这个符号

        在同一个 目录下 文件名 与文件夹 名 不能重复

        在计算机中 万物皆字节

        常用的 获取功能
            public String getName() 获取对象的名字
            获取对象的大小 占用字节数
            public Long Length() 获取文件中的字节个数

            public String getAbsoutePath() 获取 file对象的 绝对路径
                就是 从盘符开始算的一个 路径字符串

            public String getPath() 获取file对象的 封装路径
             也就是 封装的时候怎么写 这里得到的路径 就是什么

 */
public class Demo02File {

    public static void main(String[] args) {
        //对 D:\\aaa\\九阴真经第一重.txt文件 进行 封装 封装成File对象
        File file = new File("D:\\aaa\\九阴真经第一重.txt");

        //System.out.println(file.toString());
        //拿到了 file对象 就可以获取其 属性信息
        //public String getName() 获取对象的名字
        System.out.println("文件的名称为:" + file.getName());
        System.out.println("文件占" + file.length() +"个字节");
        System.out.println("文件的绝对路径为:" + file.getAbsolutePath());
        System.out.println("文件的封装路径为:" + file.getPath());
    }

}

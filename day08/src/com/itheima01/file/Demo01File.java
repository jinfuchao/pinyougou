package com.itheima01.file;

import java.io.File;

/*
    java.io.File 类是文件和目录文件名的抽象表示,
        java中使用File类对象来表示我们系统中的文件或者文件夹
         (指定的文件或者文件夹 需要指定路径来表示)
       要用于文件和目录的创建,查找和删除操作.

       可以根据路径 将 我们系统中的文件或者文件夹 封装一个File类型对象

       构造方法
        File(String pathname)  根据路径 封装File对象
            通过将给定路径名字符串转换为抽象路径名来创建一个新File实例

        File(File parent, String child)
            根据 parent 抽象路径名 和 child 路径名字符串创建一个新 File实例

        File(String parent,String child)
            根据 parent 路径名字符串和 child 路径名字符串创建一个新 File实例

 */
public class Demo01File {

    public static void main(String[] args) {
        // File(String pathname) 根据路径 封装File对象
        File file = new File("D:\\aaa\\HelloWorld.java");

        System.out.println(file);

        //封装一个目录为 File类型对象
        File dir = new File("D:\\aaa");

        // File(File parent, String child)  根据 父路径的File形式 与 子路径 封装成一个新的File对象
        File file2 = new File(dir,"HelloWorld.java");
        System.out.println(file2);

        //File(String parent,String child) 根据父路径的字符串形式,与子路径 封装成一个新的File对象
        File file3 = new File("D:\\aa","HelloWorld.java");
        System.out.println(file3);
    }

}

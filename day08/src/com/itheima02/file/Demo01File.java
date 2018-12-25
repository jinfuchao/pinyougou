package com.itheima02.file;

import java.io.File;

/*
    File类 判断功能
        返回值肯定是 boolean类型

        public boolean exists() 判断file封装的路径 是否真实存在

        判断 file对象 是否是 文件夹
        public boolean isDirectory()
        判断 file对象 是否是 文件
        public boolean isFile()

        判断
            一个file对象 不是文件 那么就是文件夹?
            错!!
            如果 是一个 假的文件 那么 既不是 文件 也不是文件夹
 */
public class Demo01File {

    public static void main(String[] args) {

        File file = new File("你好.txt");
        System.out.println(file);
        File file2 = new File("不好.txt");
        System.out.println(file2);

        // file文件 是 存在的 file2文件 不存在 是一个假文件
        // boolean exists() 判断文件或者目录是否真实存在
        System.out.println("file是否是真实存在的呢?" + file.exists());
        System.out.println("file2是否是真实存在的呢?" + file2.exists());

        /*
            现在有个file对象 路径 当前项目中 你猜我是啥.txt
         */
        File file3 = new File("你猜我是啥.txt");

        if(file3.isFile()){
            System.out.println("file3是文件");
        }

        if(file3.isDirectory()){
            System.out.println("file3是文件夹");
        }
    }
}

package com.itheima02.file;

import java.io.File;

/*
    File类 之 高级获取功能
        就是用在 目录上的
        public String[] list获取目录下 的 所有文件或者文件夹的名字
        比如 D:\\aaa 目录

        因为 仅仅获取名字 没有什么太大效果
        public File[] listFiles()
            获取 该目录下 的所有 文件 或者文件夹 的 File对象形式
            这样做 得到的 对象 可以完成 更多的功能

            假如 高级获取方法 使用一个文件去调用了呢
                会出现 异常的
 */
public class Demo03File {

    public static void main(String[] args) {
        //封装 一个 D:\\aaa 这个目录 为file对象
        File dir = new File("day08\\aaa");
        //获取该目录下 所有的 文件或文件夹的名字
        String[] names = dir.list();

        //遍历
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------");

        File[] files = dir.listFiles();
        //这个数组中 封装了 该目录下 所有的 文件file对象和 文件夹的file对象
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}

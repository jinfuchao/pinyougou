package com.itheima03.digui;

import java.io.File;

/*
    day08 module中有个文件夹
    aaa
        很多 文件 和文件夹
            文件夹里 又有很多文件和文件夹
                文件夹 又有很多文件和文件夹

        要求
            我们把该目录 day08\\aaa
            所有的 文件 及文件夹(包含子目录)找出来 并打印 他们的绝对路径
 */
public class Test {
    public static void main(String[] args) {
        //将 源目录进行封装
        File dir = new File("day08\\aaa");

        //调用一个  可以  查找该目录下 所有文件及文件夹的方法
        printDir(dir);
    }

    /*
        获取该目录下 所有的 文件及文件夹
     */
    public static void printDir(File srcdir){
        //获取目录中的 所有文件以及文件夹的File对象形式
        File[] files = srcdir.listFiles();

        // 遍历 当前目录下的所有文件以及文件夹
        for (File file : files) {
            if(file.isFile()){//是文件
                System.out.println("文件为:" + file.getAbsolutePath());
            }

            if(file.isDirectory()){//是文件夹
                System.out.println("目录为:"+ file.getAbsolutePath());
                //继续 完成目录中 文件的寻找
                printDir(file);
            }
        }
    }
}
